package com.mongo.template.mongo_with_template.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongo.template.mongo_with_template.mapper.StudentMapper;
import com.mongo.template.mongo_with_template.modal.Student;
import com.mongo.template.mongo_with_template.param.StudentParam;
import com.mongo.template.mongo_with_template.service.StudentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/student")
@Slf4j
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping
	public List<Student> findAll() {
		
		log.info("findAll()");
		return studentService.findAll();
	}
	
	@GetMapping("/{studentId}")
	public Student findById(@PathVariable("studentId") String studentId) {
		
		log.info("findById() => " + studentId);
		Optional<Student> studentOpt = studentService.findById(studentId);
		return studentOpt.orElse(null);
	}
	
	@PostMapping
	public Student save(@RequestBody StudentParam studentParam) {
		
		log.info("Going to save => " + studentParam);
		return studentService.saveOrUpdate(StudentMapper.mapToStudent(studentParam));
	}
	
}