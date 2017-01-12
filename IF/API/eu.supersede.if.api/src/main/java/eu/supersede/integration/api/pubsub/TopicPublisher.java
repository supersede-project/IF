package eu.supersede.integration.api.pubsub;

import javax.jms.*;
import javax.naming.NamingException;

public class TopicPublisher extends TopicMessageAgent implements iTopicPublisher{

//	public static void main(String[] args) throws NamingException {
//		iTopicPublisher publisher = null;
//		try {
//			publisher = new TopicPublisher(SubscriptionTopic.ANALISIS_DM_EVENT_TOPIC, true);
//			publisher.publishTextMesssageInTopic("Analysis event for DM: detected memory leak in managed system");
//		} catch (JMSException e) {
//			e.printStackTrace();
//		} finally {
//			if (publisher != null){
//				try {
//					publisher.closeTopicConnection();
//				} catch (JMSException e) {
//					throw new RuntimeException("Error in closing topic connection", e);
//				}
//			}
//		}
//	}

	public TopicPublisher(SubscriptionTopic subscriptionTopic) throws NamingException {
		super (subscriptionTopic);
	}
	
	public TopicPublisher(SubscriptionTopic subscriptionTopic, boolean openConnection) throws NamingException, JMSException {
		super (subscriptionTopic);
		if (openConnection)
			openTopicConnection();
	}

	/* (non-Javadoc)
	 * @see eu.supersede.integration.api.pubsub.iTopicPublisher#publishTextMesssageInTopic(java.lang.String)
	 */
	@Override
	public void publishTextMesssageInTopic(String message)
			throws JMSException, NamingException {
		TopicSession topicSession = topicConnection.createTopicSession(false, Session.AUTO_ACKNOWLEDGE);
		// create or use the topic
		System.out.println("Publishing on the Topic " + subscriptionTopic.getTopic());
		Topic topic = (Topic) ctx.lookup(subscriptionTopic.getTopic());
		javax.jms.TopicPublisher topicPublisher = topicSession.createPublisher(topic);
		TextMessage textMessage = topicSession.createTextMessage(message);
		topicPublisher.publish(textMessage);
		System.out.println("Publishing message " + textMessage);
		topicPublisher.close();
		topicSession.close();
	}

}