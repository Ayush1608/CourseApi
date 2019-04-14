package com.course.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course.model.Course;
import com.course.model.Topic;
import com.course.repository.CourseRepository;

@Service
public class CourseService 
{
	@Autowired
	private CourseRepository courseRepo;

	public List<Course> getAllCourses(String topicId) 
	{
		System.out.println(topicId);
		List<Course> courses = new ArrayList<Course>();
		courseRepo.findByTopicId(topicId).forEach(courses::add);	//used method reference
		System.out.println(courses);
		return courses;
	}

	public Course getCourse(String id) 
	{
		return courseRepo.findById(id).orElse(null);
	}

	public void addCourse(Course course) 
	{
		courseRepo.save(course);
	}

	public void updateCourse(String id, Course course) 
	{
		courseRepo.save(course);
	}

	public void deleteCourse(String id) {
		courseRepo.deleteById(id);
	}

	
}
