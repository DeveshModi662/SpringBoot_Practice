package com.dm.courseapi.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dm.courseapi.utils.URLConstants;
import com.dm.courseapi.dto.CourseDto;
//import com.courseapi.entities.Course;
//import com.courseapi.entities.Topic;
import com.dm.courseapi.services.CourseServiceClass;
//import com.courseapi.util.ConverterEntityDto;

@RestController
public class CourseController {
	
	@Autowired
	private CourseServiceClass courseService ;
	
	@GetMapping(value = URLConstants.COURSES_URL)
	public List<CourseDto> getAllCourses(@PathVariable("topicId") String id)
	{  
		// will be converted to JSON
//		List<Course> ent = courseService.
		return courseService.getAllCourses(id) ;
//		return converter.courseEntityToDto(ent) ;
	}

	@GetMapping(value = URLConstants.COURSE_BY_ID_URL)
	public CourseDto getCourse(@PathVariable("id") String id)
	{
//		Course ent = 
		return courseService.findCourse(id) ;
//		return converter.courseEntityToDto(ent) ;
	}
	
	@PostMapping(value = URLConstants.COURSES_URL) // method[GET]
	public void addCourse(@PathVariable String topicId, @RequestBody CourseDto newCourseDto)
	{
//		Course newCourse= converter.courseDtoToEntity(newCourseDto) ;
//		newCourse.setTopic(new Topic(topicId, "", "")) ;
		courseService.addCourse(topicId, newCourseDto) ;
	}
	
	@PutMapping(value = URLConstants.COURSE_BY_ID_URL)
	public void updateCourse(@RequestBody CourseDto newCourseDto, @PathVariable String id, @PathVariable String topicId)
	{
//		Course newCourse = converter.courseDtoToEntity(newCourseDto) ;
//		newCourse.setTopic(new Topic(topicId, "", "")) ;
		courseService.updateCourse(topicId, newCourseDto) ; //, id) ;
	}
	
	@DeleteMapping(value = URLConstants.COURSE_BY_ID_URL)
	public void deleteTopic(@PathVariable String id)
	{
		courseService.deleteCourse(id) ;
	}
}
