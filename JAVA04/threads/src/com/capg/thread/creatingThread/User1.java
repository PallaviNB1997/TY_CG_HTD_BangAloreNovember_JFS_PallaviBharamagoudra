package com.capg.thread.creatingThread;

public class User1 extends Thread {
IRCTC i1;
User1 (IRCTC i1){
	this.i1=i1;
}
@Override
	public void run() {
	i1.confirmTicket();
	}
}


