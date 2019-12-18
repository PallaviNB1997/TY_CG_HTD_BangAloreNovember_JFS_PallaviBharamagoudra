package com.capgemini.datastructure.algorithm;

import java.time.Duration;
import java.time.Instant;

public class AlgoAnalysis {
	public static void main(String[] args) {
		long number = 999999999L;
		//System.out.println(addUpto(number));
		//System.out.println(addUptoQuick(number));
		countingDuration1();
		countingDuration2();
	}
	//one way of dding method
	public static long addUpto(long number) { //1st memo assignment
		long total= 0L;                       //2nd memo assignment
		for(long i=0 ; i<=number ; i++) {     //3rd memo assignment
			total = total + i;                //4th memo assignment
		}
		return total;
	}
	//method 2
	public static long addUptoQuick(long number) {
		return number * (number + 1)/2;
	}
	//method 3
	public static void countingDuration1() {
		long number = 9999999999L;
		Instant  start = Instant.now(); // will record the time
		System.out.println("addUpto: "+addUpto(number));
		Instant end = Instant.now();
		long duration = Duration.between(start, end).toMillis();
		double seconds = duration/1000;
		System.out.println("addUpto time: "+ seconds + "seconds");
		
	}
	
	public static void countingDuration2() {
		long number = 9999999999L;
		Instant  start = Instant.now(); // will record the time
		System.out.println("addUpto: "+addUptoQuick(number));
		Instant end = Instant.now();
		long duration = Duration.between(start, end).toMillis();
		double seconds = duration/1000;
		System.out.println("addUpto time: "+ seconds + "seconds");
		
	}
}
