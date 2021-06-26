package com.mongo.template.mongo_with_template.service;

import java.util.List;
import java.util.Optional;

import com.mongo.template.mongo_with_template.modal.Employee;

public interface EmployeeService {

	public List<Employee> findAll();
	
	public Optional<Employee> findById(String id);
	
	public Employee save(Employee employee);
	
	public void deleteById(String id);
	
}