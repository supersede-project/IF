package eu.supersede.integration.api.dm.types;

public class UserRequest {
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public RequestClassification getClassification() {
		return classification;
	}

	public void setClassification(RequestClassification classification) {
		this.classification = classification;
	}

	public double getAccuracy() {
		return accuracy;
	}

	public void setAccuracy(double accuracy) {
		this.accuracy = accuracy;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPositiveSentiment() {
		return positiveSentiment;
	}

	public void setPositiveSentiment(int positiveSentiment) {
		this.positiveSentiment = positiveSentiment;
	}

	public int getNegativeSentiment() {
		return negativeSentiment;
	}

	public void setNegativeSentiment(int negativeSentiment) {
		this.negativeSentiment = negativeSentiment;
	}

	public int getOverallSentiment() {
		return overallSentiment;
	}

	public void setOverallSentiment(int overallSentiment) {
		this.overallSentiment = overallSentiment;
	}

	public String[] getFeedbackIDs() {
		return feedbackIDs;
	}

	public void setFeedbackIDs(String[] feedbackIDs) {
		this.feedbackIDs = feedbackIDs;
	}

	public String[] getFeatures() {
		return features;
	}

	public void setFeatures(String[] features) {
		this.features = features;
	}

	String					id;
	RequestClassification	classification;
	double					accuracy;
	String					description;
	int						positiveSentiment;
	int						negativeSentiment;
	int						overallSentiment;
	String[]				feedbackIDs;
	String[]				features;
	
	public UserRequest() {}
	
	public UserRequest( 
			String					id, 
			RequestClassification	classification,
			double					accuracy,
			String					description,
			int						positiveSentiment,
			int						negativeSentiment,
			int						overallSentiment,
			String[]				feedbackIDs,
			String[]				features
			) {
		
		this.id = id;
		this.classification = classification;
		this.accuracy = accuracy;
		this.description = description;
		this.positiveSentiment = positiveSentiment;
		this.negativeSentiment = negativeSentiment;
		this.overallSentiment = overallSentiment;
		this.feedbackIDs = feedbackIDs;
		this.features = features;
		
	}
	
}
