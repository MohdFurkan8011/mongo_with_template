package com.mongo.template.mongo_with_template.modal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "employee_register")
@Data
public class Employee {

	@Id
	private String id;
	
	private String firstName;
	
	private String lastName;
	
	private String address;
	
}