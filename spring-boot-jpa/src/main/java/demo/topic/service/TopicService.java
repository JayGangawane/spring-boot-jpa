package demo.topic.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import demo.topic.Topic;

/**
 * This class is annotated with @Service, hence spring will create ONLY 1 instance
 * of this class and use it all places where ever it is referenced via @Autowired
 * @author CORP\jayvg
 *
 */
@Service
public class TopicService {

	private List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic("id1", "spring", "spring topics"),
			new Topic("id2", "cloud computing", "cloud computing topic desc")));
	
	public List<Topic> getAllTopics() {
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	
	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	public void updateTopic(Topic topic, String id) {
		for (int i =0; i < topics.size(); i++) {
			Topic t = topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i, topic);
				break;
			}
		}
		
	}

	public void deleteTopic(String id) {
		topics.removeIf(t -> t.getId().equals(id));
	}
}
