package demo.jpa.course.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import demo.jpa.course.CourseEntity;

/**
 * CrudRepository is interface given by spring data that provides standard 
 * CRUD operations. Spring data also provides implementation of the standard CRUD 
 * methods at runtime for this interface.
 * We just need to extend this interface.
 * For any custom methods like finding entities based on some particular filters etc,
 * we need to implement them ourselves.
 * CrudRepository takes 2 generic types, 1st is type of entity we are dealing with ..
 * .. here it is CourseEntity 
 * and 2nd is type of Id/primary key this class has, in our case it is of type String.
 * 
 * Refer to CourseEntityService.java for more details.
 * @author CORP\jayvg
 *
 */

public interface CourseRepository extends CrudRepository<CourseEntity, String> {

	/**
	 * here spring jpa automatically identifies what is the usecase based on 
	 * naming convention of method .. 
	 * start with find .. then follow with All or By ..
	 * then the name of field on which you want to filter, in this case name .. 
	 * 
	 * NO need to implement this method!! spring jpa does it for you automatically!!
	 * @param name
	 * @return
	 */
	public List<CourseEntity> findByName(String name);
	
	/**
	 * this method will also be automatically implemented by spring jpa!!
	 * it will figure out we need to filter on description column.
	 * name of method param can be anything .. 
	 * @param foo
	 * @return
	 */
	public List<CourseEntity> findByDescription(String anythinggoeshere);
	
	/**
	 * IMPORTANT!! PAY SPECIAL ATTENTION HERE ..
	 * Since Topic is an complex Object, we need to specify not only the column 
	 * name topic, but also the field inside it ..i.e. id in this case .. 
	 * 
	 *  method names always in camel case!!
	 * @param anythinggoeshere
	 * @return
	 */
	public List<CourseEntity> findByTopicId(String anythinggoeshere);
}
