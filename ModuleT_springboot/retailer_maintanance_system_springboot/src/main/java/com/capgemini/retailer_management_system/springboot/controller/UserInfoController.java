package com.capgemini.retailer_management_system.springboot.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.capgemini.retailer_management_system.springboot.dto.ProductInfo;
import com.capgemini.retailer_management_system.springboot.dto.ProductInfoResponse;
import com.capgemini.retailer_management_system.springboot.dto.UserInfo;
import com.capgemini.retailer_management_system.springboot.dto.UserInfoResponse;
import com.capgemini.retailer_management_system.springboot.service.ProductInfoService;
import com.capgemini.retailer_management_system.springboot.service.UserInfoService;

public class UserInfoController {
	@Autowired
	UserInfoService service;
	
	@PostMapping(path="/add-User",produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public UserInfoResponse addUser(@RequestBody UserInfo user) {
		UserInfoResponse response = new UserInfoResponse();
		if(service.addUser(user)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("User added");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("User with same name already exists");
		}
		return response;
	}
	
	@GetMapping(path="/view-User",produces = MediaType.APPLICATION_JSON_VALUE)
	public UserInfoResponse viewUser(@RequestParam("id") int id) {
		UserInfoResponse response = new UserInfoResponse();
		UserInfo user=service.getUser(id);
		if(user!=null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("User found");
			response.setUserInfo(Arrays.asList(user));
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("User id does not exist");
		}
		return response;
	}
	
	@GetMapping(path="/view-allUsers",produces = MediaType.APPLICATION_JSON_VALUE)
	public UserInfoResponse viewAllUsers() {
		UserInfoResponse response = new UserInfoResponse();
		List<UserInfo> list=service.getAllUsers();
		if(list.size()!=0) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Users found");
			response.setUserInfo(list);
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("No data");
		}
		return response;
		
	}
	
	@PostMapping(path = "/login", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public UserInfoResponse login(@RequestBody UserInfo user) {
		UserInfoResponse response = new UserInfoResponse();
		UserInfo account = service.login(user);
		if (account != null) {
			response.setStatusCode(201);
			response.setDescription("Success");
			response.setMessage("Logged in");
			response.setDescription("User found...");
		} else {
			response.setStatusCode(405);
			response.setDescription("Failure");
			response.setMessage("Provide valid credentials");
		}
		return response;
	}
}
