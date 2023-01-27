package com.dm.courseapi.services;

import java.util.List;

import com.dm.courseapi.dto.TopicDto;
//import com.courseapi.entities.Topic;

public interface TopicServiceClass {

	public List<TopicDto> getAllTopics() ;
	public TopicDto findTopic(String id) ;
	public void addTopic(TopicDto toAdd) ;
	public void updateTopic(TopicDto newTopic, String id) ;
	public void deleteTopic(String id) ;
	
}
