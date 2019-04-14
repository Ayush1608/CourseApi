package com.course.repository;

import org.springframework.data.repository.CrudRepository;
import com.course.model.Topic;

public interface TopicRepository extends CrudRepository<Topic, String>{

}
