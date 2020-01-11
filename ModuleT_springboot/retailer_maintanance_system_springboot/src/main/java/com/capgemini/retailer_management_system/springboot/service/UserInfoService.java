package com.capgemini.retailer_management_system.springboot.service;

import java.util.List;

import com.capgemini.retailer_management_system.springboot.dto.UserInfo;

public interface UserInfoService {
	public boolean addUser(UserInfo User);

	public UserInfo getUser(int id);

	public List<UserInfo> getAllUsers();
	
	public UserInfo login(UserInfo userinfo);
	
	public boolean updatePassword(int id, String password);
	

}
