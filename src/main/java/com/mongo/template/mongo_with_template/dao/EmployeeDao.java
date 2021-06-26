package com.mongo.template.mongo_with_template.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.mongo.template.mongo_with_template.modal.Employee;

@Repository
public class EmployeeDao {

	@Autowired
	private MongoTemplate mongoTemplate;
	
	public List<Employee> findAll() {
		
		return mongoTemplate.findAll(Employee.class);
	}
	
	public Optional<Employee> findById(String id) {
		
		return Optional.ofNullable(mongoTemplate.findById(id, Employee.class));
	}
	
	public Employee saveOrUpdate(Employee employee) {

		return mongoTemplate.save(employee);
	}
	
	public void deleteById(String id) {
		
		Query query = new Query(Criteria.where("id").is(id));
		mongoTemplate.findAndRemove(query, Employee.class);
	}
	
}