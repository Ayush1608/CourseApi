package com.course.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.course.model.Topic;
import com.course.repository.TopicRepository;

@Service
public class TopicsService 
{
	@Autowired
	private TopicRepository topicRepo;
	
	/*List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("java", "Core Java", "Core Java Description"),
			new Topic("javascript", "Javascript", "JavaScript Description")
			));*/
	
	public List<Topic> getAllTopics()
	{
		List<Topic> topics = new ArrayList<Topic>();
		topicRepo.findAll().forEach(topics::add);		//used method reference
		return topics;
	}

	public Topic getTopic(String id) {
//		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		
		return topicRepo.findById(id).orElse(null);
		
//		for(Topic topic : topics)
//		{
//			if(topic.getId().equals(id))
//				return topic;
//		}
//		return null;
	}

	public void addTopic(Topic topic) {
		topicRepo.save(topic);
		//topics.add(topic);
	}

	public void updateTopic(String id, Topic topic) {
		topicRepo.save(topic);
		
		/*for(int i = 0 ; i < topics.size(); i++)
		{
			Topic top = topics.get(i);
			if(top.getId().equals(id))
			{
				topics.set(i, topic);
			}
		}*/
	} 

	public void deleteTopic(String id) {
	//	topics.removeIf(t -> t.getId().equals(id));				//Used Lambda
		
		topicRepo.deleteById(id);
		
//		for(int i = 0 ; i < topics.size(); i++)
//		{
//			Topic top = topics.get(i);
//			if(top.getId().equals(id))
//			{
//				topics.remove(i);
//			}
//		}
	}
}
