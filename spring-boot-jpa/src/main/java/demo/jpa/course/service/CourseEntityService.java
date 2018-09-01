package demo.jpa.course.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.jpa.course.CourseEntity;
import demo.jpa.course.repository.CourseRepository;

@Service
public class CourseEntityService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	public List<CourseEntity> getAllCourses(String topicId) {
		//refer to method findByTopicId in CourseRepository interface and
		// read the comments there
		return courseRepository.findByTopicId(topicId);
	}
	
	public void addCourse(CourseEntity course) {
		courseRepository.save(course);
	}
	
	public CourseEntity getCourse(String id) {
		return courseRepository.findById(id).get();
	}

	/**
	 * acts as Upsert i.e. add if not present, else update if present
	 * @param course
	 */
	public void updateCourse(CourseEntity course) {
		courseRepository.save(course);
	}

	public void deleteCourse(String id) {
		courseRepository.deleteById(id);
	}

}
