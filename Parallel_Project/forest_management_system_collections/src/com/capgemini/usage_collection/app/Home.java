package com.capgemini.usage_collection.app;

import java.util.Scanner;

public class Home {
	//public static void main4() {
	public static void home() {
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("\n");
			System.out.println("WELCOME TO FOREST MANAGEMENT SYSTEM");
			System.out.println("\n");
			System.out.println("select your choice...\n");
			System.out.println("1.Customer\n2.Contractor\n3.Product\n");
		int choice=sc.nextInt();
		switch (choice) {
		case 1: 
			CustomerMain.main2();

			break;
		case 2:ContractMain.main1();

			break;
		case 3:ProductMain.main3();

			break;

		default:
			break;
		}
	}
}
}
