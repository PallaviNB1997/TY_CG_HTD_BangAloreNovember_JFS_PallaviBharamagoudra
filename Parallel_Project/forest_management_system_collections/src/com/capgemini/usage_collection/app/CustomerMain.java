package com.capgemini.usage_collection.app;

import java.io.ObjectInputStream.GetField;
import java.util.List;
import java.util.Scanner;

import com.capgemini.usage_collection.bean.CustomerBean;
import com.capgemini.usage_collection.dao.CustomerDAO;
import com.capgemini.usage_collection.factory.Factory;

public class CustomerMain {
	public static void main2() {

		Scanner sc= new Scanner(System.in);
		CustomerDAO dao=Factory.getCustImpl();
		System.out.println("Customer:");
		while(true) {
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
				System.out.println("Enter the email");
				bean1.setEmail(sc.next());
				
				boolean b= dao.addCustomer(bean1);
				if(b) {
					//System.out.println(bean1);
					System.out.println("Customer succussfully added..");
				}else {
					System.err.println("Customer Id already exist..");
				}
				break;

			case 2: 
				System.out.println("Delete the user");
				System.out.println("Enter Customer Id: ");
				int p=sc.nextInt();
				boolean b1=dao.deleteCustomer(p);
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
				
				CustomerBean bean2=new CustomerBean();
				
			
				
				//System.out.println("Enter cusomerId ");
				bean2.setCustomerId(customerid);
				
				
				
				System.out.println("Enter customer name");
				bean2.setCustomerName(sc.next());
				System.out.println("Enter Address Street1");
				bean2.setStreetAddress1(sc.next());
				System.out.println("Enter Address street 2");
				bean2.setStreetAddress2(sc.next());
				System.out.println("Enter Town");
				bean2.setTown(sc.next());
				System.out.println("Enter post code");
				bean2.setPostalCode(sc.nextInt());
				System.out.println("Enter the email");
				bean2.setEmail(sc.next());
				
				boolean b3= dao.modifyCustomer(bean2);
				if(b3) {
					
					System.out.println("Customer details successfully updated..");
				}else {
					System.err.println("Something went wrong...");
				}
				break;

			case 4:List<CustomerBean> c2 = dao.getAllCustomer();
			System.out.println(c2);
			    break;
			case 5:
				Home.home();
			

			default:
				break;
			}
		}
	}
}
