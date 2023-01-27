package com.dm.courseapi.controllers;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.dm.courseapi.utils.URLConstants;
import com.dm.courseapi.dto.TopicDto;
//import com.courseapi.entities.Topic;
import com.dm.courseapi.services.TopicServiceClass;

//import com.courseapi.util.ConverterEntityDto;

@RestController
public class TopicController {
	
	@Autowired
	private TopicServiceClass topicService ;  /// -----1	
	
//	private TopicServiceImpl topicService = new TopicServiceImpl() ; // -----2
/*
	1.									2.
	Spring managed singleton
	Loose coupling
	IOC involved	
*/

	@GetMapping(value = URLConstants.GREET_URL)
	public String greet()
	{
		return "Hi" ;
	}
	
	@GetMapping(value = URLConstants.TOPICS_URL)
	public List<TopicDto> getList()
	{  
		// will be converted to JSON
		return topicService.getAllTopics() ; 
	}

	@GetMapping(value = URLConstants.TOPIC_BY_ID_URL)
	public TopicDto getTopic(@PathVariable("topicId") String id)
	{
//		Topic ent = 
		return topicService.findTopic(id) ;
//		return converter.topicEntityToDto(ent) ;
	}
	
	@PostMapping(value = URLConstants.TOPICS_URL) // method[GET]
	public void addTopic(@RequestBody TopicDto newTopicDto)
	{
//		Topic newTopic = converter.topicDtoToEntity(newTopicDto) ;
		topicService.addTopic(newTopicDto) ;
	}
	
	@PutMapping(value = URLConstants.TOPIC_BY_ID_URL) // method[GET]
	public void updateTopic(@RequestBody TopicDto newTopicDto, @PathVariable("topicId") String id)
	{
//		Topic newTopic = converter.topicDtoToEntity(newTopicDto) ;
		topicService.updateTopic(newTopicDto, id) ;
	}
	
	@DeleteMapping(value = URLConstants.TOPIC_BY_ID_URL) 
	public void deleteTopic(@PathVariable("topicId") String id)
	{
		topicService.deleteTopic(id) ;
	}
}
