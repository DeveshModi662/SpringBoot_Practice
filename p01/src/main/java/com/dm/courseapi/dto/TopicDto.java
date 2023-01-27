package com.dm.courseapi.dto;

public class TopicDto {
	private String topicId ;
	private String topicName ;
	private String topicDescription ;
	

	public TopicDto() {
	}
	
	public TopicDto(String topicId, String name, String description) {
		super();
		this.topicId = topicId;
		this.topicName = name;
		this.topicDescription = description;
	}
	
	public String getTopicId() {
		return topicId;
	}
	public void setTopicId(String topicId) {
		this.topicId =topicId;
	}
	public String getTopicName() {
		return topicName;
	}
	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}
	public String getTopicDescription() {
		return topicDescription ;
	}
	public void setTopicDescription(String topicDescription) {
		this.topicDescription = topicDescription ;
	}	
}
