package eu.supersede.integration.api.pubsub.test;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;
import javax.naming.NamingException;

import org.junit.Before;
import org.junit.Test;

import eu.supersede.integration.api.pubsub.SubscriptionTopic;
import eu.supersede.integration.api.pubsub.TopicPublisher;
import eu.supersede.integration.api.pubsub.TopicSubscriber;
import eu.supersede.integration.api.pubsub.iTopicPublisher;
import eu.supersede.integration.federation.SupersedeFederation;

public class PubSubTest implements Runnable {
	private boolean messageReceived = false;
	private boolean subscriptionDone = false;
	private static SupersedeFederation federation = new SupersedeFederation();

	@Before
	public void setup() throws Exception {
		(new Thread(this)).start();
	}

	@Test
	public void testPublishTextMessage() throws Exception {
		startPublisher();
	}

	private void startPublisher() throws NamingException {
		TopicPublisher publisher = null;
		try {
			try {
				while (!subscriptionDone) {
					Thread.sleep(1000); // FIXME Configure sleeping time
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			publisher = new TopicPublisher(SubscriptionTopic.ANALISIS_DM_EVOLUTION_EVENT_TOPIC, true,
					federation.getLocalFederatedSupersedePlatform().getPlatform());
			publisher.publishTextMesssageInTopic("Analysis event for DM: detected memory leak in managed system");
			try {
				while (!messageReceived) {
					Thread.sleep(1000); // FIXME Configure sleeping time
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} catch (JMSException e) {
			e.printStackTrace();
		} finally {
			if (publisher != null) {
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
		TopicSubscriber subscriber = null;
		try {
			subscriber = new TopicSubscriber(SubscriptionTopic.ANALISIS_DM_EVOLUTION_EVENT_TOPIC);
			subscriber.openTopicConnection();
			TextMessageListener messageListener = new TextMessageListener();
			subscriber.createTopicSubscriptionAndKeepListening(messageListener);
			subscriptionDone = true;
			try {
				while (!messageReceived) {
					Thread.sleep(1000); // FIXME Configure sleeping time
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			subscriber.closeSubscription();
			subscriber.closeTopicConnection();
		} catch (JMSException e) {
			e.printStackTrace();
		} finally {
			if (subscriber != null) {
				try {
					subscriber.closeTopicConnection();
				} catch (JMSException e) {
					throw new RuntimeException("Error in closing topic connection", e);
				}
			}
		}
	}

	public class TextMessageListener implements MessageListener {
		public void onMessage(Message message) {
			try {
				System.out.println("Got the Message : " + ((TextMessage) message).getText());
				messageReceived = true;
			} catch (JMSException e) {
				e.printStackTrace();
			}
		}
	}

}
