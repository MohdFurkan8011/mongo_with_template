package com.mongo.template.mongo_with_template.service;

import java.util.List;
import java.util.Optional;

import com.mongo.template.mongo_with_template.modal.Student;

public interface StudentService {

	public List<Student> findAll();
	
	public Optional<Student> findById(String studentId);
	
	public Student saveOrUpdate(Student student);
	
}
