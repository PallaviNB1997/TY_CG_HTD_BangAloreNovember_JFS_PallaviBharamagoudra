package com.capgemini.retailer_management_system.springboot.dao;

import java.util.List;

import com.capgemini.retailer_management_system.springboot.dto.UserInfo;

public interface UserInfoDao {
	public boolean addUser(UserInfo User);

	public UserInfo getUser(int id);

	public List<UserInfo> getAllUsers();
	
	public UserInfo login(UserInfo userinfo);
	
	public boolean updatePassword(int id, String password);
	

}
