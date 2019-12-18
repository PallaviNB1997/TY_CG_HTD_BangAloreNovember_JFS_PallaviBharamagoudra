package com.capgemini.jdbc.controller;

import java.util.Scanner;

import com.capgemini.jdbc.bean.UserBean;
import com.capgemini.jdbc.factory.UserFactory;
import com.capgemini.jdbc.services.UserServices;

public class LoginUser {
public static void main(String[] args) {
	UserServices services=UserFactory.instancesOfUserServices();

	Scanner Sc=new Scanner(System.in);
	UserBean user=new UserBean();
	
	System.out.println("Enter username");
	user.setUsername(Sc.nextLine());
	System.out.println("Enter password");
	user.setPassword(Sc.nextLine());
	
	UserBean u1=services.userLogin(user.getUsername(), user.getPassword());
	if(u1!=null) {
		System.out.println("userid="+u1.getUserid());
		System.out.println("username="+u1.getUsername());
		System.out.println("email="+u1.getEmail());
	}else
	{
		System.out.println("something wrong");
	}
	
}
}
