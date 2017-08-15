package com.dmm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.dmm.dao.UserMapper;
import com.dmm.model.User;
import com.dmm.service.DubboTranscationService;

public class DubboTranscationServiceImpl implements DubboTranscationService {
	
	@Autowired
	private UserMapper userMapper;
	
	@Transactional
	public void insertUser(Integer type) {
		User user = new User();
		user.setUserid(4);
		user.setUsername("比企谷小町");
		user.setPassword("123456");
		userMapper.insertSelective(user);
		if (type == 1) {
		} else {
			int b = 1/0;
			System.out.println(b);
		}
	}
}
