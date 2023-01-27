package com.dm.courseapi.entities;

import javax.persistence.Id;
import javax.persistence.ManyToOne;

//import lombok.Data;

import javax.persistence.Entity;

//@Data
@Entity
public class Course {
	
	@Id
	private String id ;
	private String name ;
	private Integer price ;
	
	@ManyToOne
	private Topic topic ;
	
	public Course() {
	}
	public Course(String id, String name, Integer price, String topicId) {
		super();
		this.id = id;
		this.name = name;
		this.price = price ;
		this.topic = new Topic(topicId, "", "") ;
	}
	
	public Topic getTopic() {
		return topic;
	}
	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	
	
}