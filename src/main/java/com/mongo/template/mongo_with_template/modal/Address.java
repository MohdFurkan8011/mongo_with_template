package com.mongo.template.mongo_with_template.modal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "address")
@Data
public class Address {

	@Id
	private String addressId;
	private String address1;
	private String city;
	private String state;
	private String pincode;
	
}