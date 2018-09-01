package demo.jpa.topic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import demo.jpa.topic.TopicEntity;
import demo.jpa.topic.service.TopicEntityService;

@RestController
@RequestMapping("/jpa")
public class TopicEntityController {
	
	@Autowired
	private TopicEntityService topicService;

	@RequestMapping("/topics")
	public List<TopicEntity> getTopics(){
		return topicService.getAllTopics();
	}
	
	/**
	 * here since path variable and method argument variable is same, it automatically
	 * maps to it.
	 * in case name of path variable is different use this syntax:
	 *  /topics/{foo} @PathVariable("foo") String id
	 * @param id
	 * @return
	 */
	@RequestMapping("/topics/{id}")
	public TopicEntity getTopicWithId(@PathVariable String id) {
		return topicService.getTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public void addTopic(@RequestBody TopicEntity topic) {
		topicService.addTopic(topic);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/topics")
	public void updateTopic(@RequestBody TopicEntity topic) {
		topicService.updateTopic(topic);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
	public void deleteTopic(@PathVariable String id) {
		topicService.deleteTopic(id);
	}
}
