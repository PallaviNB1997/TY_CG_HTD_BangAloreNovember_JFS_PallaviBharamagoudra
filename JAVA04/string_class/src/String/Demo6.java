package String;

public class Demo6 {
public static void main(String[] args) {
	Demo5 d1=new Demo5("john",25);
	
	d1=new Demo5("mikel",22);
	System.out.println("hashcode is   "+d1.hashCode());
	int age=d1.getAge();//generate getters and setters in Demo5 in source
	System.out.println(age);
	System.out.println("hashcode is   "+d1.hashCode());
	String name=d1.getName();
	System.out.println(name);
	System.out.println("hashcode is   "+d1.hashCode());
	
}
}
