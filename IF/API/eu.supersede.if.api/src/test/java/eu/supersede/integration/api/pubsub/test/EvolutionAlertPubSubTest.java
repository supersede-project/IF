package eu.supersede.integration.api.pubsub.test;

import java.util.ArrayList;
import java.util.List;

import javax.jms.JMSException;
import javax.naming.NamingException;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;

import eu.supersede.integration.api.dm.types.Alert;
import eu.supersede.integration.api.dm.types.Condition;
import eu.supersede.integration.api.dm.types.DataID;
import eu.supersede.integration.api.dm.types.Operator;
import eu.supersede.integration.api.dm.types.RequestClassification;
import eu.supersede.integration.api.dm.types.UserRequest;
import eu.supersede.integration.api.pubsub.evolution.EvolutionAlertMessageListener;
import eu.supersede.integration.api.pubsub.evolution.EvolutionPublisher;
import eu.supersede.integration.api.pubsub.evolution.EvolutionSubscriber;
import eu.supersede.integration.api.pubsub.evolution.iEvolutionPublisher;
import eu.supersede.integration.api.pubsub.evolution.iEvolutionSubscriber;
import eu.supersede.integration.exception.IFException;
import eu.supersede.integration.federation.SupersedeFederation;

public class EvolutionAlertPubSubTest implements Runnable{
	private boolean messageReceived = false;
	private boolean subscriptionDone = false;
	private static SupersedeFederation federation = new SupersedeFederation();
	private int num_attempts = 5;
	
	@Before
    public void setup() throws Exception {
		(new Thread(this)).start();
    }

    @Test
    public void testPublishEvolutionAlertMessage() throws Exception{
    	startPublisher();
    }

	private void startPublisher() throws NamingException, JsonProcessingException, IFException {
		iEvolutionPublisher publisher = null;
		int num_messages = 1;
		try {
			try {
				while (!subscriptionDone) {
					Thread.sleep(1000); //FIXME Configure sleeping time
				}
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			publisher = new EvolutionPublisher(true, federation.getLocalFederatedSupersedePlatform().getPlatform());
			Alert alert = createAlert();
			for (int i=0; i<num_messages; i++){
				if (!publisher.publishEvolutionAlertMesssage(alert)) {
					throw new IFException ("An alert could not be published");
				}
			}
			try {
				while (!messageReceived && num_attempts-->0) {
					Thread.sleep(1000); //FIXME Configure sleeping time
				}
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (messageReceived == false) {
				throw new RuntimeException("Message was not published"); 
			}
		} catch (JMSException e) {
			e.printStackTrace();
		} finally {
			if (publisher != null){
				try {
					publisher.closeTopicConnection();
				} catch (JMSException e) {
					throw new RuntimeException("Error in closing topic connection", e);
				}
			}
		}
	}

	@Override
	public void run() {
		try {
			// Invoking Subscriber
			startSubscriber();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void startSubscriber() throws Exception {
		iEvolutionSubscriber subscriber = null;
		try {
			subscriber = new EvolutionSubscriber();
			subscriber.openTopicConnection();
			EvolutionAlertMessageListener messageListener 
				= subscriber.createEvolutionAlertSubscriptionAndKeepListening();
			subscriptionDone = true;
			try {
				while (!messageListener.areMessageReceived()) {
//				while (true) {
					Thread.sleep(1000); //FIXME Configure sleeping time
				}
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Received alert with id: " + messageListener.getNextAlert().getId());
			messageReceived = true;
			subscriber.closeSubscription();
			subscriber.closeTopicConnection();
		} catch (JMSException e) {
			e.printStackTrace();
		}finally{
			if (subscriber != null){
				try {
					subscriber.closeTopicConnection();
				} catch (JMSException e) {
					throw new RuntimeException("Error in closing topic connection", e);
				}
			}
		}
	}

	
	private Alert createAlert() {
		Alert alert = new Alert();
		
		alert.setId("id1");
		alert.setApplicationId("appId1");
		alert.setTimestamp(1481717773760L);
		alert.setTenant("Delta");
		
		List<Condition> conditions = new ArrayList<Condition>();
		conditions.add (new Condition(DataID.UNSPECIFIED, Operator.GEq, 10.5));
		alert.setConditions(conditions);
		
		List<UserRequest> requests = new ArrayList<>();
		String[] feedbackIDs = new String[]{"feedbackId1"};
		String[] features = new String[]{"UI","backend"};
		requests.add(new UserRequest("id1", RequestClassification.FeatureRequest, 
				0.5, "description string", 1, 2, 0, feedbackIDs, features));
		alert.setRequests(requests);
		
		return alert;
	}
}
