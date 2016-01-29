package eu.supersede.integration.poc.dynadapt;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;

import eu.supersede.integration.poc.dynadapt.rest.client.IFMessageClient;
import eu.supersede.integration.poc.dynadapt.types.AdaptationDecision;
import eu.supersede.integration.poc.dynadapt.types.AdaptationEnactment;

@Component
public class DashboardImpl {
	private static final Logger log = LoggerFactory.getLogger(DashboardImpl.class);
	private IFMessageClient messageClient = new IFMessageClient();
	private final static String DM_ENDPOINT = DynAdaptProperty.getProperty("dm.endpoint");
	private final static String ENACT_ENDPOINT = DynAdaptProperty.getProperty("enactment.endpoint");

	public void run() {
		// TODO Auto-generated method stub
		log.info("Executing dashboard implementation");
		log.info("Getting available adaptation decisions");
		try {
			UUID systemId = UUID.randomUUID();
			Collection<AdaptationDecision> decisions = getAdaptationDecisions(systemId);
			if (!decisions.isEmpty()){
				triggerEnactmentForAdaptationDecision(decisions.iterator().next().getId(), systemId);
			}
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private Collection<AdaptationDecision> getAdaptationDecisions(UUID systemId) throws URISyntaxException {
//		URI uri = new URI("http://localhost:8080/dm/adaptationDecisions/" + systemId);
		URI uri = new URI(DM_ENDPOINT + "adaptationDecisions/" + systemId);
		try {
			ResponseEntity<AdaptationDecision[]> response = messageClient.getMessage(uri, AdaptationDecision[].class);
			AdaptationDecision[] decisions = response.getBody();
			if (response.getStatusCode().equals(HttpStatus.OK)) {
				log.info("Located " + decisions.length + " decision(s)");
				for (AdaptationDecision decision:decisions){
					log.info("Decision: " + decision.toString());
				}
			} else {
				log.info("There was a problem getting available adaptation decisions");
			}
			return (Collection<AdaptationDecision>) Arrays.asList(decisions);
		} catch (RestClientException e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	public boolean triggerEnactmentForAdaptationDecision(UUID decisionId, UUID systemId) throws URISyntaxException {
//		URI uri = new URI("http://localhost:8080/enactment/triggerAdaptationDecision/" + 
//				decisionId +"/" + systemId);
		URI uri = new URI(ENACT_ENDPOINT + "triggerAdaptationDecision/" + 
				decisionId +"/" + systemId);
		//Note, object whose String serialization is valid Json must be sent to postJsonMessage
		ResponseEntity<AdaptationEnactment> response = messageClient.postJsonMessage("{}", uri, AdaptationEnactment.class);
		AdaptationEnactment ae = response.getBody();
		boolean enactment = ae.isEnactmentResult();
		if (response.getStatusCode().equals(HttpStatus.CREATED) && enactment) {
			log.info("Successful enactment of decision: " + decisionId + ". Enactment: " + ae.toString());
		} else {
			log.info("There was a problem enacting decision: " + decisionId + ". Enactment: " + ae.toString());
		}
		return enactment;
	}

}
