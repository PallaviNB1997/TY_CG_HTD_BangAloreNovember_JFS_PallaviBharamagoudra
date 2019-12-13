package com.capgemini.phone_simulator.contoller;

import java.util.Scanner;

public class Home {
	public static void home() {

		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("\n");
			System.out.println("WELCOME TO MOBILE APPLICATION");
			System.out.println("\n");
			System.out.println("select your choice...\n");
			System.out.println("1.Get all contacts\n2.Find contact\n3.Operations(add/delete/update)\n");
			int choice=sc.nextInt();
			switch (choice) {
			case 1: 
				GetAll.main1();

				break;
			case 2:
				Search.main2();
				break;
			case 3:
				ContactMain.main3();

				break;

			default:
				break;
			}

		}
	}
}






