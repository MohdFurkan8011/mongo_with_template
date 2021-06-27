package com.mongo.template.mongo_with_template.modal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collation = "course")
@Data
public class Course {

	@Id
	private String courseId;
	private String courseName;

}
