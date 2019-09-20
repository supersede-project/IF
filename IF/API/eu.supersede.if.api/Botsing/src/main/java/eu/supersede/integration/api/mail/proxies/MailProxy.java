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
package eu.supersede.integration.api.mail.proxies;

import java.net.URI;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;

import eu.supersede.integration.api.mail.types.Email;
import eu.supersede.integration.api.security.types.AuthorizationToken;
import eu.supersede.integration.properties.IntegrationProperty;
import eu.supersede.integration.rest.client.IFMessageClient;

public class MailProxy implements iMail {
	private IFMessageClient messageClient = IFMessageClient.getInstance();
	private final static String MAIL_ENDPOINT = IntegrationProperty.getProperty("mail.endpoint");
	private static final Logger log = LoggerFactory.getLogger(MailProxy.class);
	
	public void sendEmail(Email email, AuthorizationToken authenticationToken) throws Exception{
		Assert.notNull(email, "Provide a valid email");
		Assert.notNull(authenticationToken, "Provide a valid authenticationToken");
		URI uri = new URI(MAIL_ENDPOINT + "send");
		EmailPayload payload = new EmailPayload();
		log.debug("Sending message sendEmail with email: " + email 
			+ " with: authenticationToken " + authenticationToken
			+ " to Mail at uri " + uri);
		payload.setEmail(email);
		ResponseEntity<String> response = messageClient.postJsonMessage(payload, uri, authenticationToken);
		if (!response.getStatusCode().equals(HttpStatus.ACCEPTED)) {
			log.error("There was a problem sending the email");
			throw new Exception ("Send Email: There was a problem sending the email");
		}
	
	}
}

class EmailPayload{
	Email email;

	public Email getEmail() {
		return email;
	}

	public void setEmail(Email email) {
		this.email = email;
	}
}
