package eu.supersede.integration.api.feedback.repository.types;

import ch.uzh.ifi.feedback.library.rest.Service.ItemBase;
import ch.uzh.ifi.feedback.library.rest.annotations.DbAttribute;
import ch.uzh.ifi.feedback.library.rest.validation.Id;
import ch.uzh.ifi.feedback.library.rest.validation.NotNull;


//@Serialize(StatusSerializationService.class)
public class Status extends ItemBase<Status> {

	@Id
	private Integer id;

	@DbAttribute("api_user_id")
	private Integer apiUserId;
	
	@DbAttribute("feedback_id")
	@NotNull
	private Integer feedbackId;
	
	@NotNull
	private String status;
	
	public Status(Integer userId, Integer feedbackId, String status)
	{
		this.apiUserId = userId;
		this.feedbackId = feedbackId;
		this.status = status;
	}
	
	public Status()
	{
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getApiUserId() {
		return apiUserId;
	}

	public void setApiUserId(Integer apiUserId) {
		this.apiUserId = apiUserId;
	}

	public Integer getFeedbackId() {
		return feedbackId;
	}

	public void setFeedbackId(Integer feedbackId) {
		this.feedbackId = feedbackId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
