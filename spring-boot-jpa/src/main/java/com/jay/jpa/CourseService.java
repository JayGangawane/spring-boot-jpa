package com.jay.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	public List<Course> getAllCourses(String topicId) {
		//refer to method findByTopicId in CourseRepository interface and
		// read the comments there
		return courseRepository.findByTopicId(topicId);
	}
	
	public void addCourse(Course course) {
		courseRepository.save(course);
	}
	
	public Course getCourse(String id) {
		return courseRepository.findById(id).get();
	}

	/**
	 * acts as Upsert i.e. add if not present, else update if present
	 * @param course
	 */
	public void updateCourse(Course course) {
		courseRepository.save(course);
	}

	public void deleteCourse(String id) {
		courseRepository.deleteById(id);
	}

}
