package com.capg.thread.creatingThread;

public class TestB {
public static void main(String[] args) {
	System.out.println("main Thread2 started");
	Thread2 t2=new Thread2();
	Thread t = new Thread(t2);
	t.start();
	System.out.println("main Thread2 ended");

}
}
