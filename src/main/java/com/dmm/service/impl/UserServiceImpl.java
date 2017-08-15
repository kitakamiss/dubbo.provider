package com.dmm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.dmm.base.model.QueryVo;
import com.dmm.dao.UserMapper;
import com.dmm.model.User;
import com.dmm.service.UserService;
@Service(version = "111")
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User getUserById(Integer userid) {
		return userMapper.selectByPrimaryKey(userid);
	}
	@Override
	public List<User> findAll() {
		QueryVo queryVo = new QueryVo();
		return userMapper.selectByWhere(queryVo);
	}

}
