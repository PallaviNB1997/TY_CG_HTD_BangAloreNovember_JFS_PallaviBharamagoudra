package com.tyss.queue.priorityqueue;

import java.util.PriorityQueue;

public class PriorityQueue2 {
public static void main(String[] args) 
{
	PriorityQueue<Student> p1 =new PriorityQueue<Student>();
	p1.offer(new Student(22, "paggi"));
	p1.offer(new Student(21, "paggu"));
	p1.offer(new Student(20, "prag"));
	p1.offer(new Student(23, "praggu"));
	
	System.out.println("----------");
	
	
	System.out.println(p1.element());
	System.out.println("----------");
	
	
	
	for (Object object:p1) {
		System.out.println(object);
		
	}
}
}
