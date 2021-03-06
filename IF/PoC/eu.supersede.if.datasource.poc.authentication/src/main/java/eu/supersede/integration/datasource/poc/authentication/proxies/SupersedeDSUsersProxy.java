/*******************************************************************************
 * Copyright (c) 2016 ATOS Spain S.A.
 * All rights reserved. Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Contributors:
 *     Yosu Gorroñogoitia (ATOS) - main development
 *
 * Initially developed in the context of SUPERSEDE EU project www.supersede.eu
 *******************************************************************************/
package eu.supersede.integration.datasource.poc.authentication.proxies;

import java.net.URI;
import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;

import eu.supersede.integration.api.security.types.AuthorizationToken;
import eu.supersede.integration.datasource.poc.authentication.json.JsonUtils;
import eu.supersede.integration.datasource.poc.authentication.types.Role;
import eu.supersede.integration.datasource.poc.authentication.types.User;
import eu.supersede.integration.datasource.poc.authentication.types.UsersCollection;
import eu.supersede.integration.properties.IntegrationProperty;
import eu.supersede.integration.rest.client.IFMessageClient;

public class SupersedeDSUsersProxy {
	private IFMessageClient messageClient = new IFMessageClient();
	private final static String SUPERSEDE_DS_USERS_ENDPOINT = IntegrationProperty.getProperty("supersede.ds.users");
	private static final Logger log = LoggerFactory.getLogger(SupersedeDSUsersProxy.class);
	private SupersedeDSRolesxUsersProxy rolesxUsersProxy = new SupersedeDSRolesxUsersProxy();
	
	//Only returns JSON representation, expressed explicitly
	public UsersCollection getUsers(AuthorizationToken token) {
		try {
			URI uri = new URI(SUPERSEDE_DS_USERS_ENDPOINT);
			ResponseEntity<User[]> response = messageClient.getMessage(uri, User[].class, MediaType.APPLICATION_XML, token);
			User[] collection = response.getBody();
			if (response.getStatusCode().equals(HttpStatus.OK)) {
				log.info("Located " + collection.length + " user(s)");
			} else {
				log.info("There was a problem getting supersede users");
			}
			return new UsersCollection (Arrays.asList(collection));
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public User getUser(int userId, AuthorizationToken token) {
		try {
			Assert.isTrue(userId>0, "User id cannot be unasigned");
			URI uri = new URI(SUPERSEDE_DS_USERS_ENDPOINT + userId);
			ResponseEntity<User> response = messageClient.getMessage(uri, User.class, MediaType.APPLICATION_XML, token);
			User user = response.getBody();
			if (response.getStatusCode().equals(HttpStatus.OK)) {
				log.info("Located user: " + user.getLogin());
			} else {
				log.info("There was a problem getting the supersede user for id: " + userId);
			}
			return user;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public User getUserWithRoles(int userId, AuthorizationToken token) {
		try {
			Assert.isTrue(userId>0, "User id cannot be unasigned");
			URI uri = new URI(SUPERSEDE_DS_USERS_ENDPOINT + userId + "/withRoles");
			ResponseEntity<User> response = messageClient.getMessage(uri, User.class, MediaType.APPLICATION_XML, token);
			User user = response.getBody();
			if (response.getStatusCode().equals(HttpStatus.OK)) {
				log.info("Located user: " + user.getLogin());
			} else {
				log.info("There was a problem getting the supersede user for id: " + userId);
			}
			return user;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public int createUser (User user, AuthorizationToken token){
		try {
			URI uri = new URI(SUPERSEDE_DS_USERS_ENDPOINT);
			ResponseEntity<String> response = messageClient.postJsonMessage(user, uri, String.class, token);
			String userId = JsonUtils.evaluatePathInJson(response.getBody(), "/UserRecord/UserID").asText();
			int result = Integer.parseInt(userId);
			user.setUserId(result);
			if (response.getStatusCode().equals(HttpStatus.OK)) {
				log.info("User: " + user.getLogin() + " created");
			} else {
				log.info("There was a problem creating the supersede user for login: " + user.getLogin());
			}
			if (response.getStatusCode().equals(HttpStatus.OK) && user.getRoles() != null){
				Role[] roles = user.getRoles();
				for (int i=0; i<roles.length; i++){
					Role role = roles[i];
					rolesxUsersProxy.addRoleForUser(role, user, token);
				}
			}
			
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}
	
	public void updateUser (User user, AuthorizationToken token){
		try {
			Assert.notNull(user, "User cannot be null");
			Assert.isTrue(user.getUserId()>0, "User id cannot be unasigned");
			URI uri = new URI(SUPERSEDE_DS_USERS_ENDPOINT + user.getUserId());
			ResponseEntity<String> response = messageClient.putJsonMessage(user, uri, token);
			
			if (response.getStatusCode().equals(HttpStatus.ACCEPTED)) {
				log.info("User: " + user.getLogin() + " updated");
			} else {
				log.info("There was a problem updating the supersede user for login: " + user.getLogin());
			}
			
			if (response.getStatusCode().equals(HttpStatus.ACCEPTED) && user.getRoles()!= null){
				Role[] roles = user.getRoles();
				rolesxUsersProxy.deleteAllRolesForUser(user, token);
				for (int i=0; i<roles.length; i++){
					Role role = roles[i];
					rolesxUsersProxy.addRoleForUser(role, user, token);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deleteUser (User user, AuthorizationToken token){
		try {
			Assert.isTrue(user.getUserId()>0, "User id cannot be unasigned");
			// Relations between users and roles have to be removed first
			rolesxUsersProxy.deleteAllRolesForUser(user, token);
			
			URI uri = new URI(SUPERSEDE_DS_USERS_ENDPOINT + user.getUserId());
			ResponseEntity<String> response = messageClient.deleteJsonMessage(uri, token);
			if (response.getStatusCode().equals(HttpStatus.ACCEPTED)) {
				log.info("User: " + user.getLogin() + " deleted");
			} else {
				log.info("There was a problem deleting the supersede user for login: " + user.getLogin());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
