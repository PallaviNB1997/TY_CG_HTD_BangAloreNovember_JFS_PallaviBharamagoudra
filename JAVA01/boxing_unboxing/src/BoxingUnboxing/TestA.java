package BoxingUnboxing;

public class TestA {
	public static void main(String[] args) {
		int i1=10;
		//Boxing
		Integer i2=new Integer(i1);
		
		//Unboing
		int i3=i2.intValue();
		
		
		double d1=25.35;
		//Boxing
		Double d2=new Double(d1);
		//Unboxing
		
		double d3=d2.doubleValue();
		
		System.out.println(i1);
		System.out.println(i2);
	}

}
