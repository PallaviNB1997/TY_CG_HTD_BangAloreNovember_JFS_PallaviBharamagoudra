package com.capg.HashMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMap1 {
public static void main(String[] args) {
	LinkedHashMap<String,Integer> l1= new LinkedHashMap<String,Integer>();
	
	l1.put("BTM", 580023 );
	l1.put("BRT", 580024);
	l1.put("HEBBAL", 580025);
	l1.put("RAJAJINAGAR", 580026);
	
	System.out.println(l1);
	System.out.println("------------");
	
	l1.remove("BTM"); //remove
	Set<Map.Entry<String, Integer>> s1=l1.entrySet();
	
//	l1.containsKey(null);//contains all
//	Set<Map.Entry<String, Integer>> s2=l1.entrySet();
//	
//	 
	
	for (Map.Entry<String, Integer> e1 : s1) {
		System.out.println(e1.getKey());
		System.out.println(e1.getValue());
		System.out.println("----------------------------");
	}

//	for (Map.Entry<String, Integer> e2 : s2) {
//		System.out.println(e2.getKey());
//		System.out.println(e2.getValue());
//		System.out.println("----------------------------");
//	}
	
	
	
}
}
