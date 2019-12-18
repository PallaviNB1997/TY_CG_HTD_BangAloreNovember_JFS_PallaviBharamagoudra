package com.capg.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap1 
{
public static void main(String[] args)
{
	HashMap<Integer,String> h1 = new HashMap<Integer,String>();
	
	h1.put(9, "Ramesh");
	h1.put(50, "Suresh");
	h1.put(30, "Ganesh");
	h1.put(8, "Mahesh");
	h1.put(5, "Harish");
	
	Set<Map.Entry<Integer,String>> s1 = h1.entrySet(); //Set is return type of entry
	
	for (Map.Entry<Integer, String> e1 : s1) {
		System.out.println(e1.getKey());
		System.out.println(e1.getValue());
		System.out.println("------------------");
	}
	
	h1.remove(5, "Harish");
	System.out.println(h1);
	
	
	System.out.println(h1.get(30));
	
	
}
}
