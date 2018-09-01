package com.jay.jpa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;
	
	public List<Topic> getAllTopics() {
		List<Topic> entityList = new ArrayList<>();
		topicRepository.findAll()
		.forEach(entityList::add);
		return entityList;
	}
	
	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}
	
	public Topic getTopic(String id) {
		return topicRepository.findById(id).get();
	}

	/**
	 * acts as Upsert i.e. add if not present, else update if present
	 * @param topic
	 */
	public void updateTopic(Topic topic) {
		topicRepository.save(topic);
	}

	public void deleteTopic(String id) {
		topicRepository.deleteById(id);
	}

}
