package com.dm.courseapi.services;

import java.util.List;

import com.dm.courseapi.dto.CourseDto;
//import com.courseapi.entities.Course;

public interface CourseServiceClass {
	
	public List<CourseDto> getAllCourses(String topicId) ;
	public CourseDto findCourse(String id) ;
	public void addCourse(String topicId, CourseDto toAdd) ;
	public void updateCourse(String topicId, CourseDto newCourse) ;
	public void deleteCourse(String id) ; 
	
}
