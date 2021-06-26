package com.mongo.template.mongo_with_template.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mongo.template.mongo_with_template.dao.EmployeeDao;
import com.mongo.template.mongo_with_template.modal.Employee;
import com.mongo.template.mongo_with_template.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDao employeeDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Employee> findAll() {
		
		return employeeDao.findAll();
	}
	
	@Override
	@Transactional(readOnly = true)
	public Optional<Employee> findById(String id) {
		
		return employeeDao.findById(id);
	}
	
	@Override
	@Transactional
	public Employee save(Employee employee) {
		
		return employeeDao.saveOrUpdate(employee);
	}
	
	@Override
	@Transactional
	public void deleteById(String id) {
		
		employeeDao.deleteById(id);
	}
	
}