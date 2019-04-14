package com.course.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages= {"com.course"})
@EntityScan(basePackages= {"com.course.model"})
@EnableJpaRepositories(basePackages= {"com.course.repository"})
public class CourseApiApp {

	public static void main(String[] args) 
	{
		SpringApplication.run(CourseApiApp.class, args);
	}

}
