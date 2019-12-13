package com.capgemini.phone_simulator.contoller;

import java.util.List;
import java.util.Scanner;

import com.capgemini.factory.Factory;
import com.capgemini.phone_simulator.bean.ContactBean;
import com.capgemini.phone_simulator.services.ContactService;

public class GetAll {
	public static void main1() {
		ContactService service =Factory.instanceOfContactService();
		Scanner sc= new Scanner(System.in);

		System.out.println("Contact:");
		while(true) 
		{
			List<ContactBean> l1 = service.getAllContacts();
			System.out.println(l1);
		}
	}
}