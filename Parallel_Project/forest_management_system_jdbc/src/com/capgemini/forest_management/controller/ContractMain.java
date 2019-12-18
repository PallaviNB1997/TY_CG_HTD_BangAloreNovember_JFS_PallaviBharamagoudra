package com.capgemini.forest_management.controller;
import java.util.List;
import java.util.Scanner;

import com.capgemini.forest_management.bean.ContractBean;
import com.capgemini.forest_management.factory.Factory;
import com.capgemini.forest_management.services.ContractServices;




public class ContractMain {
	public static void main1() {
		
		Scanner sc = new Scanner(System.in);
		ContractServices service =Factory.instanceOfContractServices();

		System.out.println("Contract:");
		while(true)
		{
			System.out.println("Enter contract Details..");
			System.out.println("1.Add contract\n2.Delete contract\n3.Get All Contract\n4.Home");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				ContractBean bean3=new ContractBean();
				System.out.println("Add contract no");
				bean3.setContractNo(sc.nextInt());
				System.out.println("Add CustomertId");
				bean3.setCustomerId(sc.nextInt());
				System.out.println("Add ProductId");
				bean3.setProductId(sc.nextInt());
				System.out.println("Add HaulierId");
				bean3.setHaulierId(sc.nextInt());
				System.out.println("Add Delivery date");
				bean3.setDeliveryDate(sc.next());
				System.out.println("Add Delivery day");
				bean3.setDeliveryDay(sc.next());
				System.out.println("Add Quantity");
				bean3.setQuantity(sc.nextInt());

				boolean b= service.addContract(bean3);
				if(b== true) {
					System.out.println(" Contract succussfully Added..");
				}else {
					System.err.println("Contract Id alredy exist...");
				}
				break;

			case 2:
				ContractBean bean4=new ContractBean();
				System.out.println("Enter contractId");
				int contractid=sc.nextInt();
				
				boolean b4=service.deleteContract(contractid);
				if(b4==true)
				{					
					System.out.println("Contract Deleted");
				}
				else {
					System.out.println("Try again..");
					System.out.println("-----------");
				}	
				break;

			case 3:
				List<ContractBean> c3 = service.getAllContract();
				System.out.println(c3);
				break;
			case 4:
				Home1.home1();
				break;
			default:
				break;
			}
		}
	}
}
