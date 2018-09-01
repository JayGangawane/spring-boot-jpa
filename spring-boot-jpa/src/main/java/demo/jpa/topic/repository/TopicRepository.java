package demo.jpa.topic.repository;

import org.springframework.data.repository.CrudRepository;

import demo.jpa.topic.TopicEntity;

/**
 * CrudRepository is interface given by spring data that provides standard 
 * CRUD operations. Spring data also provides implementation of the standard CRUD 
 * methods at runtime for this interface.
 * We just need to extend this interface.
 * For any custom methods like finding entities based on some particular filters etc,
 * we need to implement them ourselves.
 * CrudRepository takes 2 generic types, 1st is type of entity we are dealing with ..
 * .. here it is TopicEntity 
 * and 2nd is type of Id/primary key this class has, in our case it is of type String.
 * 
 * Refer to TopicEntityService.java for more details.
 * @author CORP\jayvg
 *
 */

public interface TopicRepository extends CrudRepository<TopicEntity, String> {


}
