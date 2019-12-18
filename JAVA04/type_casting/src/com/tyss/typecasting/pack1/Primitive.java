package com.tyss.typecasting.pack1;

public class Primitive {
	//implicit typecasting
	
	double d=11;
	byte b=5;
	short s= b;
	
	void values() {
	System.out.println("int a="+s);
	System.out.println("int a="+b);
	
	
	}
	
	
	//explicit  put primitive type in () 
	
	double pi=3.142;
	int i=(int)pi;
	void details() {
		System.out.println("int value is  "+i);
	}
	
	
	

}
