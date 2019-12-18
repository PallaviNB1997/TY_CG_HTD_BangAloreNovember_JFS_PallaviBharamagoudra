package com.capgemini.usage_collection.app;

import java.util.List;
//import java.util.List;
import java.util.Scanner;

import javax.xml.parsers.FactoryConfigurationError;

import com.capgemini.usage_collection.bean.ContractBean;
import com.capgemini.usage_collection.bean.CustomerBean;
import com.capgemini.usage_collection.dao.ContractDAO;
import com.capgemini.usage_collection.factory.Factory;

public class ContractMain {
	public static void main1() {
		Scanner sc = new Scanner(System.in);
		ContractDAO dao =Factory.getContraImpl();

		System.out.println("Contract:");
		while(true)
		{
			System.out.println("Enter contract Details..");
			System.out.println("1.Add contract\n2.Delete contract\n3.Get All Contract");
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
				bean3.setQuantity(sc.next());

				boolean b= dao.addContract(bean3);
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
				boolean b4=dao.deleteContract(contractid);
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
				List<ContractBean> c3 = dao.getAllContract();
				System.out.println(c3);
				break;
			case 5:
				Home.home();
				break;
			default:
				break;
			}
		}
	}
}
