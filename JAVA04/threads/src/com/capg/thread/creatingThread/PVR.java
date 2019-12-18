package com.capg.thread.creatingThread;

public class PVR {
synchronized void confirmTicket() {
	for(int i=0;i<5;i++) {
		System.out.println(i);
//		 try {
//			Thread.sleep(500); //non synchronized
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		try {
			wait(); // method present in object can access anywhere // Synchronized
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
}
synchronized void leaveMe() {
	System.out.println("Notify called");
	notify();
}

}  
