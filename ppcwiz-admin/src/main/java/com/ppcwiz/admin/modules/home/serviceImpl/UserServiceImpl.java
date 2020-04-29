package com.ppcwiz.admin.modules.home.serviceImpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ppcwiz.admin.modules.home.domain.UserVO;

import com.ppcwiz.admin.modules.home.mapper.UserMapper;

import com.ppcwiz.admin.modules.home.service.UserService;


@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserMapper userMapper;
	
	@Override
	public ArrayList<UserVO> list() {
		ArrayList<UserVO> users = userMapper.list();
//		users.forEach(user -> System.out.println(user.getEmail()));
		return userMapper.list();
	}
}
