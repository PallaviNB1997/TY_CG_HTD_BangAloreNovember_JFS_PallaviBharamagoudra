package com.capg.thread.creatingThread;

public class TestD {
public static void main(String[] args) {
	System.out.println("IRCTC main start");
	IRCTC i1=new IRCTC();
	
	User1 u1=new User1(i1);
	u1.start();
	User1 u2=new User1(i1);
	u2.start();
	System.out.println("IRCTC main end");
	
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	i1.leaveMe();
}
}
