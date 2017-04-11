package com.jing.serviceImpl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jing.entity.User;
import com.jing.mapper.UserMapper;
import com.jing.response.ResponseResult;
import com.jing.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{

	private static Logger logger = Logger.getLogger(UserServiceImpl.class);
	
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User getUser() {
		User user = new User(2, "小明", 20);
		logger.info("get user :" + user.toString());
		return user;
	}

	@Override
	public ResponseResult saveUser(User user) {
		logger.info("saveuser,userinfo:"+user.toString());
		int result = userMapper.saveUser(user);
		return (result == 1)?new ResponseResult("200", "保存用户成功"):new ResponseResult("500", "保存用户失败");
	}

	@Override
	@Transactional
	public ResponseResult update(String id) {
		logger.info("update,user id:"+id);
		int result = userMapper.updateUser("1");
		return (result == 1)?new ResponseResult("200", "更新用户成功"):new ResponseResult("500", "更新用户成功");
	}
}
