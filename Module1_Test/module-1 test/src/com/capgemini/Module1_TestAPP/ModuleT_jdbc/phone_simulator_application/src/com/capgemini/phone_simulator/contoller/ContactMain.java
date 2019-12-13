package com.capgemini.phone_simulator.contoller;

import java.util.Scanner;

import com.capgemini.factory.Factory;
import com.capgemini.phone_simulator.bean.ContactBean;
import com.capgemini.phone_simulator.services.ContactService;



public class ContactMain {
	public static void main3() {



		ContactService service =Factory.instanceOfContactService();
		Scanner sc= new Scanner(System.in);

		System.out.println("Contact:");
		while(true) 
		{
			System.out.println("1.Add Contact\n2.Delete Contact\n3.Update Contact");
			int choice=sc.nextInt();
			switch (choice) {
			case 1:

				ContactBean bean1=new ContactBean();
				System.out.println("Add Contact Details");



				System.out.println("Enter Contact Name");
				bean1.setContactName(sc.next());
				System.out.println("Enter contact Number");
				bean1.setContactNumber(sc.nextInt());
				System.out.println("Enter group Name");
				bean1.setGroupName(sc.next());

				;

				boolean b= service.addContact(bean1);


				if(b)//==true) 
				{
					System.out.println("Contact succussfully added..");
				}else {

					System.err.println("Contact Name already exist..");
				}
				break;




			case 2: 
				System.out.println("Delete the Contact ");
				System.out.println("Enter contact Name ");
				String s=sc.next();
				boolean b1=service.deleteContact(s);
				if(b1==true)
				{					
					System.out.println("Contact Deleted");
				}
				else {
					System.out.println("Try again..");
					System.out.println("-----------");
				}			
				break;

			case 3:	
				System.out.println("Enter Contact name");
				String contactName=sc.next();

				System.out.println("Enter number to be update");
				int contactNumber=sc.nextInt();


				ContactBean bean2=new ContactBean();

				bean2.setContactName(contactName);
				bean2.setContactNumber(contactNumber);

				boolean b3=service.updateContact(contactName,contactNumber);


				if(b3) {

					System.out.println("Contact successfully updated..");
				}else {

					System.err.println("Try Again...");
				}
				break;		

			default:
				break;
			}
		}



	}
}



































