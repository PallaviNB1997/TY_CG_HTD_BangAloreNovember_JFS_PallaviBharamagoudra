package com.capg.HashMap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap2Stud {
public static void main(String[] args) {
	TreeMap<Student,String> t1=new TreeMap<Student,String>();
	
	t1.put(new Student(23,"anu"),"1st Std");
	t1.put(new Student(24,"anusha"),"3st Std");
	t1.put(new Student(20,"anushree"),"8st Std");
	
	
	
	Set<Map.Entry<Student, String>> s1=t1.entrySet();
	
	for (Map.Entry<Student, String> e1 : s1) {
		System.out.println(e1.getKey());
		System.out.println(e1.getValue());
		System.out.println("--------------");
	}
	//System.out.println(t1.get(new Student (18,"anu")));
}
}
