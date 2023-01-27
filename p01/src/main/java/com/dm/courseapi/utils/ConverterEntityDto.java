package com.dm.courseapi.utils;

import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import java.util.List;
import com.dm.courseapi.dto.CourseDto;
import com.dm.courseapi.dto.TopicDto;
import com.dm.courseapi.entities.Course;
import com.dm.courseapi.entities.Topic;

@Component
public class ConverterEntityDto {

	public Topic topicDtoToEntity(TopicDto dto)
	{
//		Topic topicEntity = new Topic(dto.getId(), dto.getName(), dto.getDescritption()) ; // necessary to use new keyword ??
		Topic topicEntity = new Topic() ; // necessary to use new keyword ??
		topicEntity.setId(dto.getTopicId());
		topicEntity.setName(dto.getTopicName());
		topicEntity.setDescription(dto.getTopicDescription());
		return topicEntity ;
	}
	public Course courseDtoToEntity(CourseDto dto)
	{
		Course courseEntity = new Course() ; // necessary to use new keyword ??
		courseEntity.setId(dto.getCourseId());
		courseEntity.setName(dto.getCourseName());
		courseEntity.setPrice(dto.getCoursePrice());
		courseEntity.setTopic(new Topic(dto.getCourseTopicId(), "", ""));
		return courseEntity ;
	}
	public TopicDto topicEntityToDto(Topic ent)
	{
		TopicDto dto = new TopicDto() ;
		dto.setTopicId(ent.getId());
		dto.setTopicName(ent.getName());
		dto.setTopicDescription(ent.getDescription());
		return dto ;
	}
	public CourseDto courseEntityToDto(Course ent)
	{
		CourseDto dto = new CourseDto() ;
		dto.setCourseId(ent.getId());
		dto.setCourseName(ent.getName());
		dto.setCoursePrice(ent.getPrice());
		dto.setCourseTopicId(ent.getTopic().getId());
		return dto ;
	}

	public List<Topic> topicDtoToEntity(List<TopicDto> dto)
	{
		return dto.stream().map(x -> topicDtoToEntity(x)).collect(Collectors.toList()) ;
	}
	public List<Course> courseDtoToEntity(List<CourseDto> dto)
	{
		return dto.stream().map(x -> courseDtoToEntity(x)).collect(Collectors.toList()) ;
	}
	public List<TopicDto> topicEntityToDto(List<Topic> ent)
	{
		return ent.stream().map(x -> topicEntityToDto(x)).collect(Collectors.toList()) ;
	}
	public List<CourseDto> courseEntityToDto(List<Course> ent)
	{
		return ent.stream().map(x -> courseEntityToDto(x)).collect(Collectors.toList()) ;	
	}

}
