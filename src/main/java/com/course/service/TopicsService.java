package com.course.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.course.model.Topic;

@Service
public class TopicsService 
{
	List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("java", "Core Java", "Core Java Description"),
			new Topic("javascript", "Javascript", "JavaScript Description")
			));
	
	public List<Topic> getAllTopics()
	{
		return topics;
	}

	public Topic getTopic(String id) {
//		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		for(Topic topic : topics)
		{
			if(topic.getId().equals(id))
				return topic;
		}
		return null;
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	public void updateTopic(String id, Topic topic) {
		for(int i = 0 ; i < topics.size(); i++)
		{
			Topic top = topics.get(i);
			if(top.getId().equals(id))
			{
				topics.set(i, topic);
			}
		}
	}

	public void deleteTopic(String id) {
	//	topics.removeIf(t -> t.getId().equals(id));
		for(int i = 0 ; i < topics.size(); i++)
		{
			Topic top = topics.get(i);
			if(top.getId().equals(id))
			{
				topics.remove(i);
			}
		}
	}
}
