package com.mongo.template.mongo_with_template.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.mongo.template.mongo_with_template.modal.Address;

@Repository
public class AddressDao {

	@Autowired
	private MongoTemplate mongoTemplate;
	
	public void save(Address address) {
		
		mongoTemplate.save(address);
	}
	
}
