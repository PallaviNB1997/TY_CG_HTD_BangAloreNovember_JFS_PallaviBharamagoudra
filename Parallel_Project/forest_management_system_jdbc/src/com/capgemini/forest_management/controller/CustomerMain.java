package com.capgemini.forest_management.controller;

import java.util.List;
import java.util.Scanner;

import com.capgemini.forest_management.bean.CustomerBean;
import com.capgemini.forest_management.factory.Factory;
import com.capgemini.forest_management.services.CustomerServices;

public class CustomerMain {
	public static void main2() {
	

	
	CustomerServices service =Factory.instanceOfCustomerServices();
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Customer:");
	while(true) 
	{
		System.out.println("1.Add Customer\n2.Delete Cusomer\n3.Modify Customer\n4.Get All Customer\n5.Home");
		int choice=sc.nextInt();
		switch (choice) {
		case 1:
			
			CustomerBean bean1=new CustomerBean();
			System.out.println("Add Customer Details");


			
			System.out.println("Enter customer name");
			bean1.setCustomerName(sc.next());
		
			System.out.println("Enter Customer Id");
			bean1.setCustomerId(sc.nextInt());
			System.out.println("Enter Address Street1");
			bean1.setStreetAddress1(sc.next());
			System.out.println("Enter Address street 2");
			bean1.setStreetAddress2(sc.next());
			System.out.println("Enter Town");
			bean1.setTown(sc.next());
			System.out.println("Enter post code");
			bean1.setPostalCode(sc.nextInt());
			System.out.println("Enter telephone ");
			bean1.setTelephone(sc.nextInt());
			System.out.println("Enter the email");
			bean1.setEmail(sc.next());
		
			boolean b= service.addCustomer(bean1);
			
			
			if(b==true) {
		
				System.out.println("Customer succussfully added..");
			}else {
				
				System.err.println("Customer Id already exist..");
			}
			break;
			
			
			

		case 2: 
			System.out.println("Delete the user");
			System.out.println("Enter Customer Id: ");
			int p=sc.nextInt();
			boolean b1=service.deleteCustomer(p);
			if(b1)//==true)
			{					
				System.out.println("customer Deleted");
			}
			else {
				System.out.println("Try again..");
				System.out.println("-----------");
			}			
			break;
			
		case 3:	
			System.out.println("Write customer id to be modified");
			int customerid=sc.nextInt();
			
			System.out.println("Write email to be modified");
			String email =sc.next();
					
			CustomerBean bean2=new CustomerBean();
			
			
			bean2.setCustomerId(customerid);		
			bean2.setEmail(email);
			
			boolean b3= service.modifyCustomer(customerid,email);
			
			if(b3) {
								
				System.out.println("Customer details successfully updated..");
			}else {
				
				System.err.println("Something went wrong...");
			}
			break;

		case 4:
			List<CustomerBean> c2 = service.getAllCustomers();
		System.out.println(c2);
		    break;
		case 5:
			Home1.home1();
		

		default:
			break;
		}
	}
}
}
