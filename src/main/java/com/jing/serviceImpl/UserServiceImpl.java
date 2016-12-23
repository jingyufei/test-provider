package com.jing.serviceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jing.entity.User;
import com.jing.mapper.UserMapper;
import com.jing.response.ResponseResult;
import com.jing.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{

	private static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
	
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User getUser() {
		User user = new User(2, "小明", 20);
		return user;
	}

	@Override
	public ResponseResult saveUser(User user) {
		logger.info("saveuser,userinfo:"+user.toString());
		int result = userMapper.saveUser(user);
		return (result == 1)?new ResponseResult("200", "保存用户成功"):new ResponseResult("500", "保存用户失败");
	}
}
