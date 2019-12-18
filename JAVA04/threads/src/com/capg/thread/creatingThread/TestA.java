package com.capg.thread.creatingThread;

public class TestA {
public static void main(String[] args) {
	System.out.println("main of Thread1 start");
	Thread1 t1= new Thread1();
	t1.start();
	System.out.println("main of Thread1 is ended ");
}
}
