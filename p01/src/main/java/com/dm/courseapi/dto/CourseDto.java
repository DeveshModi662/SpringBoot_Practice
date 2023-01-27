package com.dm.courseapi.dto;

public class CourseDto {
	
	private String courseID ;
	private String courseName ;
	private Integer coursePrice ;
	private String courseTopicId ;

	public CourseDto() {
	}
	public CourseDto(String courseID, String courseName, Integer coursePrice, String courseTopicId) {
		super();
		this.courseID = courseID;
		this.courseName = courseName;
		this.coursePrice = coursePrice ;
		this.courseTopicId = courseTopicId ;
	}

	public String getCourseTopicId() {
		return courseTopicId;
	}
	public void setCourseTopicId(String courseTopicId) {
		this.courseTopicId = courseTopicId;
	}
	public String getCourseId() {
		return courseID;
	}
	public void setCourseId(String courseID) {
		this.courseID = courseID;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Integer getCoursePrice() {
		return coursePrice;
	}
	public void setCoursePrice(Integer coursePrice) {
		this.coursePrice = coursePrice;
	}

	

}
