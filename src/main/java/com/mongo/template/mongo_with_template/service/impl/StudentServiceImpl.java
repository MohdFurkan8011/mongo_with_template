package com.mongo.template.mongo_with_template.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mongo.template.mongo_with_template.dao.StudentDao;
import com.mongo.template.mongo_with_template.modal.Student;
import com.mongo.template.mongo_with_template.service.AddressService;
import com.mongo.template.mongo_with_template.service.CourseService;
import com.mongo.template.mongo_with_template.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;
	
	@Autowired
	private AddressService addressService;
	
	@Autowired
	private CourseService courseService;
	
	@Override
	@Transactional(readOnly = true)
	public List<Student> findAll() {
		
		return studentDao.findAll();
	}
	
	@Override
	@Transactional(readOnly = true)
	public Optional<Student> findById(String id) {
		
		return studentDao.findById(id);
	}
	
	@Override
	@Transactional
	public Student saveOrUpdate(Student student) {
		
		addressService.save(student.getAddress());
		student.getCourses().stream().forEach(courseService::save);
		
		return studentDao.saveOrUpdate(student);
	}
	
}