package com.course.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.course.model.Course;

public interface CourseRepository extends CrudRepository<Course, String>{
	/*
	 * we can define our own methods for which we don't even have to provide implementation
	 * JPA will do it for us. But, there is a convention which is to be followed for naming the methods.
	 * We start by find then give variable name through which we find record.
	 */
	
	public List<Course> findByName(String name);
	public List<Course> findByTopicId(String topicId);	//	here topic is itself  class so we give Id to match it with string parameter.

}
