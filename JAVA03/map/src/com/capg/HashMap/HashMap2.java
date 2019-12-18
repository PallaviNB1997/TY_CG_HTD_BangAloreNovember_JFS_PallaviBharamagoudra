package com.capg.HashMap;

import java.util.Collection;
import java.util.HashMap;

public class HashMap2 {
public static void main(String[] args) {
	HashMap<Integer,Student> h1 = new HashMap<Integer,Student>();
	
	h1.put(35, new Student(22,"Pallavi"));
	h1.put(36, new Student(22,"Pavan"));
	h1.put(null, null);
	h1.put(37, new Student(23,"Pavi"));
	h1.put(38, new Student(22,"Pavvi"));
	//System.out.println(h1);
	Collection<Student> c1 = h1.values();     //Collection is return type for Student
	
	for (Student s1 : c1) {
		System.out.println(s1);
	}
	
	System.out.println("-----for only key-----");
	Collection<Integer> i1 =h1.keySet();
	for (Integer i2 : i1) {
//		Collection<Integer> i1 =h1.keySet()
		System.out.println(i2);
	}
	
	System.out.println(h1.containsKey(35));
	System.out.println(h1.containsValue("Pallavi"));
	System.out.println(h1.size());
	
}
}
