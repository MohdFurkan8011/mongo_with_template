package com.mongo.template.mongo_with_template.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.mongo.template.mongo_with_template.modal.Course;

@Repository
public class CourseDao {

	@Autowired
	private MongoTemplate mongoTemplate;
	
	public void save(Course course) {
		
		mongoTemplate.save(course);
	}
	
}
