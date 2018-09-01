package com.jay.jpa;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

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
public class Course {
	
	@Id
	private String id;
	private String name;
	private String description;
	@ManyToOne
	private Topic topic;
	
	public Course() {
	}

	public Course(String id, String name, String description, String topicId) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.topic = new Topic(topicId, "", "");
	}
	
	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
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
