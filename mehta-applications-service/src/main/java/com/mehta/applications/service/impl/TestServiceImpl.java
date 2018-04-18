package com.mehta.applications.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mehta.applications.repository.TestRepository;
import com.mehta.applications.service.TestService;

@Service
public class TestServiceImpl implements TestService    {

	@Autowired
	TestRepository testRepository;
	
	@Override
	public Object testList() {
		Object userList  = testRepository.findAllUser();
		return userList;
	}
	
		
}
