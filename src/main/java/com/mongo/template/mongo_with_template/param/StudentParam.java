package com.mongo.template.mongo_with_template.param;

import java.util.List;

import lombok.Data;

@Data
public class StudentParam {

	private String firstName;
	private String lastName;
	
	private AddressParam address;
	private List<CourseParam> courses;
	
}