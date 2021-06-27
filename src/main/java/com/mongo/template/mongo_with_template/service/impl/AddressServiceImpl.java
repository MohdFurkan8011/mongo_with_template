package com.mongo.template.mongo_with_template.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mongo.template.mongo_with_template.dao.AddressDao;
import com.mongo.template.mongo_with_template.modal.Address;
import com.mongo.template.mongo_with_template.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService {

	@Autowired
	private AddressDao addressDao;
	
	@Override
	@Transactional
	public void save(Address address) {
		
		addressDao.save(address);
	}
	
}
