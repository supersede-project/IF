package eu.supersede.integration.api.feedback.repository.types;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import eu.supersede.integration.api.feedback.orchestrator.types.Application;

import java.util.Date;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Feedback {

    private long id;
    private String title;
    private String userIdentification;
    private Date createdAt;
    private Date updatedAt;
    private long applicationId;
    private long configurationId;
    private String language;
    @JsonIgnore
    private FeedbackStatus feedbackStatus;

    private Application application;

    private ContextInformation contextInformation;
    private List<AttachmentFeedback> attachmentFeedbacks;
    private List<AudioFeedback> audioFeedbacks;
    private List<CategoryFeedback> categoryFeedbacks;
    private List<RatingFeedback> ratingFeedbacks;
    private List<ScreenshotFeedback> screenshotFeedbacks;
    private List<TextFeedback> textFeedbacks;

    @JsonIgnore
    private List<Status> statuses;

    @Override
    public String toString() {
        return String.format(
                "Feedback[id=%d, configurationId=%d]",
                id, configurationId);
    }

    public Feedback() {
    }

    public Feedback(String title, String userIdentification, long applicationId, long configurationId, String language) {
        this.title = title;
        this.userIdentification = userIdentification;
        this.applicationId = applicationId;
        this.configurationId = configurationId;
        this.language = language;
    }

    public Feedback(String title, String userIdentification, Date createdAt, Date updatedAt, long applicationId, long configurationId, String language, ContextInformation contextInformation, List<AttachmentFeedback> attachmentFeedbacks, List<AudioFeedback> audioFeedbacks, List<CategoryFeedback> categoryFeedbacks, List<RatingFeedback> ratingFeedbacks, List<ScreenshotFeedback> screenshotFeedbacks, List<TextFeedback> textFeedbacks, List<Status> statuses) {
        this.title = title;
        this.userIdentification = userIdentification;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.applicationId = applicationId;
        this.configurationId = configurationId;
        this.language = language;
        this.contextInformation = contextInformation;
        this.attachmentFeedbacks = attachmentFeedbacks;
        this.audioFeedbacks = audioFeedbacks;
        this.categoryFeedbacks = categoryFeedbacks;
        this.ratingFeedbacks = ratingFeedbacks;
        this.screenshotFeedbacks = screenshotFeedbacks;
        this.textFeedbacks = textFeedbacks;
        this.statuses = statuses;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUserIdentification() {
        return userIdentification;
    }

    public void setUserIdentification(String userIdentification) {
        this.userIdentification = userIdentification;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public long getConfigurationId() {
        return configurationId;
    }

    public void setConfigurationId(long configurationId) {
        this.configurationId = configurationId;
    }

    public long getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(long applicationId) {
        this.applicationId = applicationId;
    }

    public List<Status> getStatuses() {
        return statuses;
    }

    public void setStatuses(List<Status> statuses) {
        this.statuses = statuses;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public ContextInformation getContextInformation() {
        return contextInformation;
    }

    public void setContextInformation(ContextInformation contextInformation) {
        this.contextInformation = contextInformation;
    }

    public List<AttachmentFeedback> getAttachmentFeedbacks() {
        return attachmentFeedbacks;
    }

    public void setAttachmentFeedbacks(List<AttachmentFeedback> attachmentFeedbacks) {
        this.attachmentFeedbacks = attachmentFeedbacks;
    }

    public List<AudioFeedback> getAudioFeedbacks() {
        return audioFeedbacks;
    }

    public void setAudioFeedbacks(List<AudioFeedback> audioFeedbacks) {
        this.audioFeedbacks = audioFeedbacks;
    }

    public List<CategoryFeedback> getCategoryFeedbacks() {
        return categoryFeedbacks;
    }

    public void setCategoryFeedbacks(List<CategoryFeedback> categoryFeedbacks) {
        this.categoryFeedbacks = categoryFeedbacks;
    }

    public List<RatingFeedback> getRatingFeedbacks() {
        return ratingFeedbacks;
    }

    public void setRatingFeedbacks(List<RatingFeedback> ratingFeedbacks) {
        this.ratingFeedbacks = ratingFeedbacks;
    }

    public List<ScreenshotFeedback> getScreenshotFeedbacks() {
        return screenshotFeedbacks;
    }

    public void setScreenshotFeedbacks(List<ScreenshotFeedback> screenshotFeedbacks) {
        this.screenshotFeedbacks = screenshotFeedbacks;
    }

    public List<TextFeedback> getTextFeedbacks() {
        return textFeedbacks;
    }

    public void setTextFeedbacks(List<TextFeedback> textFeedbacks) {
        this.textFeedbacks = textFeedbacks;
    }

    public Application getApplication() {
        return application;
    }

    public void setApplication(Application application) {
        this.application = application;
    }

	public FeedbackStatus getFeedbackStatus() {
		return feedbackStatus;
	}

	public void setFeedbackStatus(FeedbackStatus feedbackStatus) {
		this.feedbackStatus = feedbackStatus;
	}
}
