package com.dm.courseapi.services.impl;

import java.util.ArrayList;
//import java.util.Optional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dm.courseapi.dto.TopicDto;
import com.dm.courseapi.entities.Topic;
import com.dm.courseapi.utils.ConverterEntityDto;
import com.dm.courseapi.repositories.TopicRepo;
import com.dm.courseapi.services.TopicServiceClass;

@Service
public class TopicServiceImpl implements TopicServiceClass {

	@Autowired
	private TopicRepo topicRepo ;

	@Autowired
	private ConverterEntityDto converter ;
	
	
	public List<TopicDto> getAllTopics()
	{
		List<Topic> toRet = new ArrayList<>() ;
		Iterable<Topic> itr = (Iterable<Topic>)topicRepo.findAll() ;
		itr.forEach(toRet::add);
		return converter.topicEntityToDto(toRet) ;
	}
	
	public TopicDto findTopic(String id)
	{
//		Optional<Topic> topic = topicRepo.findById(id) ;
		return converter.topicEntityToDto(topicRepo.findById(id).get()) ;
//		return converter.topic.get();
	}

	public void addTopic(TopicDto toAdd)
	{
//		Topic newTopic = converter.topicDtoToEntity(newTopicDto) ;
		topicRepo.save(converter.topicDtoToEntity(toAdd)) ;
	}

	public void updateTopic(TopicDto newTopicDto, String id) {
		topicRepo.save(converter.topicDtoToEntity(newTopicDto)) ;
//		topicRepo.save(newTopic) ;
	}

	public void deleteTopic(String id) {
		topicRepo.deleteById(id) ;		
	}

}
