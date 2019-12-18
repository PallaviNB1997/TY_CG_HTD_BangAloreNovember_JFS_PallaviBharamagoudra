package com.capg.HashMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMap2 {
public static void main(String[] args) {
	LinkedHashMap<Integer,Employee> l1=new LinkedHashMap<Integer,Employee>();
	
	l1.put(34, new Employee(25000,"Ramesh"));
	l1.put(36, new Employee(25000,"Suresh"));
	l1.put(35, new Employee(25000,"Mahesh"));
	l1.put(37, new Employee(25000,"Harish"));
	
	//System.out.println(l1.get(34));
	
	Set<Map.Entry<Integer, Employee>> s1=l1.entrySet();
	
	for (Map.Entry<Integer, Employee> e1 : s1) {
		System.out.println(e1.getKey());
		System.out.println(e1.getValue());
		
	}
	System.out.println(l1.containsKey(34));
	//System.out.println(l1.containsValue(25000,"Ramesh"));
}
}
