package com.capgemini.junit.junit_five;

public class Calculator {
//	int a,b,sum;
//public int add(){
//	System.out.println("The sum is"+sum);
//	return sum=a+b;
//}
	
	public int add(int a,int b) {
		return a+b; 
	}
	
	public int mul(int c, int d) {
		return c*d;
	}
	
	public int div(int p, int q) {
		return p/q;
	}
	public int findLength(String name)
	{
		int length = name.length();
		return length;
		
	}
}
