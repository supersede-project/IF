package eu.supersede.integration.federation;

import java.util.List;

import eu.supersede.integration.api.datastore.integration.types.SupersedePlatform;
import eu.supersede.integration.api.datastore.proxies.IFDataStoreProxy;
import eu.supersede.integration.api.security.IFAccount;
import eu.supersede.integration.api.security.IFAuthenticationManager;
import eu.supersede.integration.api.security.types.AuthorizationToken;
import eu.supersede.integration.properties.IntegrationProperty;

public class SupersedeFederation {
	private List<SupersedePlatform> federatedPlatforms = null;
	private SupersedePlatform localFederatedPlatform = null;
		
	public SupersedeFederation(){
		//Get IS Token
		IFDataStoreProxy<Object, Object> proxy = new IFDataStoreProxy<Object, Object> ();
 //		String admin = System.getProperty("is.admin.user");
//		String password = System.getProperty("is.admin.passwd");
		// Read account (user, password) from classpath property file
		String admin = IFAccount.getUser();
		String password = IFAccount.getPassword();

		IFAuthenticationManager am = new IFAuthenticationManager();
		try {
			AuthorizationToken token = am.getAuthorizationToken(admin, password, "");
			//Read Local platform
			localFederatedPlatform = proxy.getSupersedePlatform(IntegrationProperty.getProperty("if.supersede.platform"), token);
			
			//Read registered platforms
			federatedPlatforms = proxy.getSupersedePlatforms(token);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	public SupersedePlatform getLocalFederatedSupersedePlatform(){
		return localFederatedPlatform;
	}
	
	public List<SupersedePlatform> getFederatedSupersedePlatforms(){
		return federatedPlatforms;
	}

	public SupersedePlatform getFederatedSupersedePlatform(String identifier) {
		SupersedePlatform platform = null;
		for (SupersedePlatform p: getFederatedSupersedePlatforms()){
			if (p.getPlatform().equals(identifier)){
				platform = p;
				break;
			}
		}
		
		return platform;
	}
	
}
