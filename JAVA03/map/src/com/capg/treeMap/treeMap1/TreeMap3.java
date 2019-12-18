package com.capg.treeMap.treeMap1;

import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap3 {
	public static void main(String[] args) {

		TreeMap<String,ArrayList<Student>> t1=new TreeMap<String,ArrayList<Student>>();

		ArrayList<Student> a1= new ArrayList<Student>();
		a1.add(new Student (20,"anu"));
		a1.add(new Student (20,"anusha"));
		a1.add(new Student (20,"anushree"));

		t1.put("Engg 1st yr", a1);
		//System.out.println(t1.get("Engg 1st yr"));
		Set<Map.Entry<String, ArrayList<Student>>> s1=t1.entrySet();

//		TreeMap<String,ArrayList<Student>> t2=new TreeMap<String,ArrayList<Student>>();
//
//		ArrayList<Student> a2= new ArrayList<Student>();
//		a2.add(new Student (20,"manu"));
//		a2.add(new Student (30,"manisha"));
//		a2.add(new Student (40,"manushree"));
//
//		t1.put("Engg 2st yr", a2);
//		System.out.println(t1.get("Engg 2st yr"));
//		Set<Map.Entry<String, ArrayList<Student>>> s2=t2.entrySet();
//
//		//	

		for (Map.Entry<String, ArrayList<Student>> entry : s1) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			System.out.println("---------------------");
		}
		
//		for (Map.Entry<String, ArrayList<Student>> entry : s2) {
//			System.out.println(entry.getKey());
//			System.out.println(entry.getValue());
//			System.out.println("---------------------");
//		}
	}
}
