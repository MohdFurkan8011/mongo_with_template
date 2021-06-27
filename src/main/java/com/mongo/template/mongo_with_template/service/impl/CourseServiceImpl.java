package com.mongo.template.mongo_with_template.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mongo.template.mongo_with_template.dao.CourseDao;
import com.mongo.template.mongo_with_template.modal.Course;
import com.mongo.template.mongo_with_template.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseDao courseDao;
	
	@Override
	@Transactional
	public void save(Course course) {
		
		courseDao.save(course);
	}
	
}
