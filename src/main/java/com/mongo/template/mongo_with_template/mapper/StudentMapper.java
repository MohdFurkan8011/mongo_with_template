package com.mongo.template.mongo_with_template.mapper;

import org.modelmapper.ModelMapper;

import com.mongo.template.mongo_with_template.modal.Student;
import com.mongo.template.mongo_with_template.param.StudentParam;

public class StudentMapper {

	private StudentMapper() {
	}

	public static Student mapToStudent(StudentParam studentParam) {

		return mapping(new Student(), studentParam);
	}

	public static Student mapToStudent(Student student, StudentParam studentParam) {

		return mapping(student, studentParam);
	}

	public static Student mapping(Student student, StudentParam studentParam) {

		ModelMapper modelMapper = new ModelMapper();
		modelMapper.map(studentParam, student);

		return student;
	}

}
