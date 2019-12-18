package com.capgemini.jdbc.controller;

import java.util.Scanner;

import com.capgemini.jdbc.bean.UserBean;
import com.capgemini.jdbc.factory.UserFactory;
import com.capgemini.jdbc.services.UserServices;

public class UpdateUser {
public static void main(String[] args) {
	UserServices services =UserFactory.instancesOfUserServices();
	UserBean user=new UserBean();
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter Email...");
	user.setEmail(sc.nextLine());
	System.out.println("Enter userid...");
	user.setUserid(Integer.parseInt(sc.nextLine()));
	System.out.println("Enter password... ");
	user.setPassword(sc.nextLine());
	
	if(services.updateUser(user.getUserid(),user.getPassword(),user.getEmail()))
	{
		System.out.println("Update");
	}
	else
		System.out.println("Something went wrong....");
	sc.close();
}

}           
