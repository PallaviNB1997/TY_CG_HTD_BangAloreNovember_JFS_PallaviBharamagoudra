package com.capgemini.retailer_management_system.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.retailer_management_system.springboot.dao.UserInfoDao;
import com.capgemini.retailer_management_system.springboot.dto.UserInfo;

@Service
public class UserInfoServiceImpl implements UserInfoService {
	@Autowired
	private UserInfoDao dao;

	@Override
	public boolean addUser(UserInfo User) {
		// TODO Auto-generated method stub
		return dao.addUser(User);
	}

	@Override
	public UserInfo getUser(int id) {
		// TODO Auto-generated method stub
		return dao.getUser(id);
	}

	@Override
	public List<UserInfo> getAllUsers() {
		// TODO Auto-generated method stub
		return dao.getAllUsers();
	}

	@Override
	public UserInfo login(UserInfo userinfo) {
		// TODO Auto-generated method stub
		return dao.login(userinfo);
	}

	@Override
	public boolean updatePassword(int id, String password) {
		// TODO Auto-generated method stub
		return dao.updatePassword(id, password);
	}

	

}
