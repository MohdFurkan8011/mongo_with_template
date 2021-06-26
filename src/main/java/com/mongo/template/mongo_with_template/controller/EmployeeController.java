package com.mongo.template.mongo_with_template.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongo.template.mongo_with_template.mapper.EmployeeMapper;
import com.mongo.template.mongo_with_template.modal.Employee;
import com.mongo.template.mongo_with_template.param.EmployeeParam;
import com.mongo.template.mongo_with_template.service.EmployeeService;

@RestController
@RequestMapping("employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping
	public List<Employee> findAll() {
		
		return employeeService.findAll();
	}
	
	@GetMapping("/{id}")
	public Employee findById(@PathVariable("id") String id) {
		
		Optional<Employee> empOpt = employeeService.findById(id);
		return empOpt.orElse(null);
	}
	
	@PostMapping
	public Employee save(@RequestBody EmployeeParam employeeParam) {
		
		return employeeService.save(EmployeeMapper.mapToEmployee(employeeParam));
	}
	
	@PutMapping("/{id}")
	public Object update(	@PathVariable("id") String id, 
							@RequestBody EmployeeParam employeeParam) {
		
		Optional<Employee> employeeOpt = employeeService.findById(id);
		employeeOpt.ifPresent(emp ->
			employeeService.save(EmployeeMapper.mapToEmployee(emp, employeeParam))
		);
		
		return employeeOpt.orElse(null);
	}
	
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable("id") String id) {
		
		employeeService.deleteById(id);
	}
	
}