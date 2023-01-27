package com.dm.courseapi.repositories;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.dm.courseapi.entities.Course;

											//  <EntityClass, Id-datatype>
public interface CourseRepo extends CrudRepository<Course, String> {
	
	public List<Course> findByTopicId(String topicId) ;
}
