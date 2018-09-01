package demo.jpa.topic.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.jpa.topic.TopicEntity;
import demo.jpa.topic.repository.TopicRepository;

@Service
public class TopicEntityService {
	
	@Autowired
	private TopicRepository topicRepository;
	
	public List<TopicEntity> getAllTopics() {
		List<TopicEntity> entityList = new ArrayList<>();
		topicRepository.findAll()
		.forEach(entityList::add);
		return entityList;
	}
	
	public void addTopic(TopicEntity topic) {
		topicRepository.save(topic);
	}
	
	public TopicEntity getTopic(String id) {
		return topicRepository.findById(id).get();
	}

	/**
	 * acts as Upsert i.e. add if not present, else update if present
	 * @param topic
	 */
	public void updateTopic(TopicEntity topic) {
		topicRepository.save(topic);
	}

	public void deleteTopic(String id) {
		topicRepository.deleteById(id);
	}

}
