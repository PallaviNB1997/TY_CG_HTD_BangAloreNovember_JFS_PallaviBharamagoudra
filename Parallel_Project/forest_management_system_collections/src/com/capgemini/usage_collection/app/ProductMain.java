package com.capgemini.usage_collection.app;

import java.util.List;
import java.util.Scanner;

import com.capgemini.usage_collection.bean.CustomerBean;
import com.capgemini.usage_collection.bean.ProductBean;
import com.capgemini.usage_collection.dao.ProductDAO;
import com.capgemini.usage_collection.factory.Factory;

public class ProductMain {
	public static void main3() {


		Scanner sc= new Scanner(System.in);
		ProductDAO dao=Factory.getProdImpl();
		System.out.println("Product....");
		while(true) {
			System.out.println("1.addProduct\n2.DeleteProduct\n3.Get all product\n4.Home");
			int choice=sc.nextInt();
			switch (choice) {
			case 1:
				ProductBean bean1=new ProductBean();
				System.out.println("Add Product Details");

				System.out.println("Enter Product Id");
				bean1.setProductId(sc.nextInt());
				System.out.println("Enter Productname");
				bean1.setProductName(sc.next());


				boolean b= dao.addProduct(bean1);
				if(b== true) {
					//System.out.println(bean1);
					System.out.println("Added..");
				}else {
					System.err.println("Oooppss");
				}
				break;

			case 2: 
				System.out.println("Delete the Product");
				System.out.println("Enter Product Id: ");
				int p=sc.nextInt();
				boolean b1=dao.deleteProduct(p);
				if(b1)//==true)
				{					
					System.out.println("Deleted");
				}
				else {
					System.out.println("Try again..");
					System.out.println("-----------");
				}			
				break;

			case 3:
				List<ProductBean> c2 = dao.getAllProduct();
				System.out.println(c2);
				break;
			case 4:
				Home.home();
				break;
			default:
				break;
			}

		}
	}
}