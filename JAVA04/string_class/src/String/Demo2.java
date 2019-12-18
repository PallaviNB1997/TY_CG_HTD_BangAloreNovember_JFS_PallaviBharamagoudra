package String;

public class Demo2 {
public static void main(String[] args) {
	String s1=new String("john");
	System.out.println("s1 hashcode   "+s1.hashCode());
	
	String s2=new String("mikel");
	String s3=new String("john");
	
	s1=new String("jerry");
	
	System.out.println("s1 hashcode   "+s1.hashCode());//new String can have dupliicate values.....string can have same hashcode n different objects..
	System.out.println("s2 hashcode   "+s2.hashCode());
	System.out.println("s3 hashcode   "+s3.hashCode());
}
}
