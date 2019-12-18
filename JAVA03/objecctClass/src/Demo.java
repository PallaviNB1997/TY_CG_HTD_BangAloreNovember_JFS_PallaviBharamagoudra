
public class Demo {
public static void main(String[] args) {
	String s1="Artist";
	String s2=new String("Artist");
	
	System.out.println(s1.equals(s2)); //checks based on hashcode value        true
	System.out.println(s1==s2);      // checks based on string value           false 
}
}
