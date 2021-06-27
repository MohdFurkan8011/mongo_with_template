package com.mongo.template.mongo_with_template.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.mongo.template.mongo_with_template.modal.Student;

@Repository
public class StudentDao {
	
	@Autowired
	private MongoTemplate mongoTemplate;
	
	public List<Student> findAll() {
		
		return mongoTemplate.findAll(Student.class);
	}
	
	public Optional<Student> findById(String studentId) {
		
		return Optional.ofNullable(mongoTemplate.findById(studentId, Student.class));
	}
	
	public Student saveOrUpdate(Student student) {

		return mongoTemplate.save(student);
	}

}
