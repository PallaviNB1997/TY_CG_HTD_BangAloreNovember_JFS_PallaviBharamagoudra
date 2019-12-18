package OverLoadinng;

public class TestCalculator {
	public static void main(String ar[]) {
		Calculator c1=new Calculator();
		int r1=c1.add(5);
		System.out.println("result is "+r1);
		
		int r2=c1.add(5,8);
		System.out.println("result is "+r2);
		
		double r3=c1.add(5.2);
		System.out.println("result is "+r3);
		
		
		
		
		Calculator.multiply(2,20);
		
		Calculator.multiply(5);
		Calculator.multiply(2.8);
	}

}
