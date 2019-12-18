package com.capg.HashMap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap1 {
public static void main(String[] args) {
	TreeMap<Integer,String> t1=new TreeMap<Integer,String> ();
	
	t1.put(123, "Divya");
//	t1.put(null, null); //NPE
	t1.put(121, "DivyaShree");
	t1.put(125, "Shree");
	Set<Map.Entry<Integer, String>> s1=t1.entrySet();
	
//	t1.containsKey(123);
//	System.out.println(t1);
	
	for (Map.Entry<Integer, String> e1 : s1) {
		System.out.println(e1.getKey());
		System.out.println(e1.getValue());
		System.out.println("--------------------");
		
	}
	
}
}
