package com.mongo.template.mongo_with_template.mapper;

import org.modelmapper.ModelMapper;

import com.mongo.template.mongo_with_template.modal.Employee;
import com.mongo.template.mongo_with_template.param.EmployeeParam;

public final class EmployeeMapper {

	private EmployeeMapper() {}
	
	public static Employee mapToEmployee(EmployeeParam employeeParam) {
		
		
		return mapping(new Employee(), employeeParam);
	}
	
	public static Employee mapToEmployee(Employee employee, EmployeeParam employeeParam) {
		
		return mapping(employee, employeeParam);
	}
	
	public static Employee mapping(Employee employee, EmployeeParam employeeParam) {
		
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.map(employeeParam, employee);
		
		return employee;
	}
	
}