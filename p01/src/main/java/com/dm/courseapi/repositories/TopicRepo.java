package com.dm.courseapi.repositories;

import org.springframework.data.repository.CrudRepository;

import com.dm.courseapi.entities.Topic;
											//  <EntityClass, Id-datatype>
public interface TopicRepo extends CrudRepository<Topic, String> {
	

}
