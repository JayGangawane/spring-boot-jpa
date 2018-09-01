package demo.jpa.course.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import demo.jpa.course.CourseEntity;
import demo.jpa.course.service.CourseEntityService;
import demo.jpa.topic.TopicEntity;

@RestController
@RequestMapping("/jpa/topics/{topicId}")
public class CourseEntityController {
	
	@Autowired
	private CourseEntityService courseService;

	@RequestMapping("/courses")
	public List<CourseEntity> getCourses(@PathVariable String topicId){
		return courseService.getAllCourses(topicId);
	}
	
	/**
	 * here since path variable and method argument variable is same, it automatically
	 * maps to it.
	 * in case name of path variable is different use this syntax:
	 *  /topics/{foo} @PathVariable("foo") String id
	 * @param id
	 * @return
	 */
	@RequestMapping("/courses/{id}")
	public CourseEntity getCourseWithId(@PathVariable String id) {
		return courseService.getCourse(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/courses")
	public void addCourse(@RequestBody CourseEntity course, @PathVariable String topicId) {
		course.setTopic(new TopicEntity(topicId, "", ""));
		courseService.addCourse(course);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/courses")
	public void updateCourse(@RequestBody CourseEntity course, @PathVariable String topicId) {
		course.setTopic(new TopicEntity(topicId, "", ""));
		courseService.updateCourse(course);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/courses/{id}")
	public void deleteTopic(@PathVariable String id) {
		courseService.deleteCourse(id);
	}
}
