package com.capg.thread.creatingThread;

public class TestC {
public static void main(String[] args) {
	System.out.println("PVR main start");
	PVR p=new PVR();
	User u1= new User(p);
	u1.start();
	System.out.println("PVR main end");
	
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
p.leaveMe();
}
}
