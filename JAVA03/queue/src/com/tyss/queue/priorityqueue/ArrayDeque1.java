package com.tyss.queue.priorityqueue;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDeque1 {
	public static void main(String[] args) {
		
	
	ArrayDeque a1=new ArrayDeque();
	a1.add(23);
	a1.add(25);
	a1.add(22);
	a1.add(63);
	  
	Iterator itr=a1.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
}
}