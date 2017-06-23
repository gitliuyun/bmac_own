package com.yingjun.ssm.service.impl;

import com.yingjun.ssm.dao.UserDao;
import com.yingjun.ssm.entity.User;
import com.yingjun.ssm.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private UserDao userDao;
	
	
	@Override
	public List<User> getUserList(int offset, int limit) {
		List<User> result_cache=userDao.queryAll(offset, limit);
		return result_cache;
	}
	
	

}
