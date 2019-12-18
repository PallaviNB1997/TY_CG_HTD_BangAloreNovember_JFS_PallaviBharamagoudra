package com.tyss.queue.priorityqueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue1 {
public static void main(String[] args) {
	Queue p1=new PriorityQueue(); 
	
	p1.offer(12);
	p1.offer(45);
	p1.offer(85);
	p1.offer(86);
	p1.offer(2);
	p1.offer(1);
	p1.offer(29);
	
	
	System.out.println(p1);
	p1.poll();//reomoves least element ....2.....
	System.out.println(p1);
	p1.poll();//removes 12............poll....
	System.out.println(p1);
	System.out.println("----------------------------");
	p1.remove(45);     //remove
	System.out.println(p1);
	System.out.println("----------------------------");
	System.out.println(p1.element());//element....
	System.out.println("----------------------------");
//	System.out.println(p1.peek());
	for(Object o1:p1) {
		System.out.println(o1);
	}
	
}
}
