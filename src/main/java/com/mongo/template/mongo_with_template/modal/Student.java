package com.mongo.template.mongo_with_template.modal;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "student")
@Data
public class Student {

	@Id
//	@Field(name = "studentId")
	private String studentId;
	
	private String firstName;
	private String lastName;
	
	@DBRef
	private Address address;
	
	@DBRef
	private List<Course> courses;

}
