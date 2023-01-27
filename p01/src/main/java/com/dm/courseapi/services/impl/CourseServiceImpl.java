package com.dm.courseapi.services.impl;

import java.util.ArrayList;
//import java.util.Optional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dm.courseapi.dto.CourseDto;
import com.dm.courseapi.entities.Course;
import com.dm.courseapi.utils.ConverterEntityDto;
//import com.courseapi.entities.Topic;
import com.dm.courseapi.repositories.CourseRepo;
import com.dm.courseapi.services.CourseServiceClass;

@Service
public class CourseServiceImpl implements CourseServiceClass {

	@Autowired
	private CourseRepo courseRepo ;
	
	@Autowired
	private ConverterEntityDto converter ;
	
		
	public List<CourseDto> getAllCourses(String topicId)
	{
		List<Course> toRet = new ArrayList<>() ;
		Iterable<Course> itr = (Iterable<Course>)courseRepo.findByTopicId(topicId) ;
		itr.forEach(toRet::add);
		return converter.courseEntityToDto(toRet) ;
	}
		
	public CourseDto findCourse(String id)
	{
//		Optional<Course> course = 
		return converter.courseEntityToDto(courseRepo.findById(id).get()) ;
//		return course.get();
	}
	
	public void addCourse(String topicId, CourseDto toAdd)
	{
		toAdd.setCourseTopicId(topicId) ;
		courseRepo.save(converter.courseDtoToEntity(toAdd)) ;
//		courseRepo.save(toAdd) ;
	}

	public void updateCourse(String topicId, CourseDto toAdd) {
		toAdd.setCourseTopicId(topicId) ;
		courseRepo.save(converter.courseDtoToEntity(toAdd)) ;
//		courseRepo.save(converter.courseDtoToEntity(newCourseDto)) ;
//		courseRepo.save(newCourse) ;		
	}

	public void deleteCourse(String id) {
		courseRepo.deleteById(id) ;		
	}

}
