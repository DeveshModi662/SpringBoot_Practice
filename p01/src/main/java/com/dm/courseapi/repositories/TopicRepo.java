package com.dm.courseapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.dm.courseapi.entities.Topic;
											//  <EntityClass, Id-datatype>
public interface TopicRepo extends JpaRepository<Topic, String> {
	

}
