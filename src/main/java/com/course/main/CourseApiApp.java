package com.course.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.course"})
public class CourseApiApp {

	public static void main(String[] args) 
	{
		SpringApplication.run(CourseApiApp.class, args);
	}

}
