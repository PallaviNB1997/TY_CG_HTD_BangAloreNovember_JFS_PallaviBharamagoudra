package Student;

public class TestStudent {

public static void main(String ar[]) {
	Student s1=new Student();
	System.out.println("Name is"+s1.sname);
	System.out.println("Age is"+s1.sage);
	
	
	Student s2=new Student("Pallavi",22);
	System.out.println("Name is"+s2.sname);
	System.out.println("Age is"+s2.sage);
}
}
