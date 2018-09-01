package demo.jpa.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import demo.jpa.topic.TopicEntity;

/**
 * @Entity tells JPA to create a table with fields given as instance variables
 * in class as columns
 * @Id tell JPA the primary key
 * One instance of this class maps to a row in database in Course table
 * 
 * Make sure this class also has a default constructor defined explicitly!!
 * @author CORP\jayvg
 *
 */
@Entity
public class CourseEntity {
	
	@Id
	private String id;
	private String name;
	private String description;
	@ManyToOne
	private TopicEntity topic;
	
	public CourseEntity() {
	}

	public CourseEntity(String id, String name, String description, String topicId) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.topic = new TopicEntity(topicId, "", "");
	}
	
	public TopicEntity getTopic() {
		return topic;
	}

	public void setTopic(TopicEntity topic) {
		this.topic = topic;
	}

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
