import java.util.TreeSet;

public class TreeSet2 {
public static void main(String[] args) {
	//EmployeeName e1 = new EmployeeName();
	TreeSet<Student> t1=new TreeSet<Student>();
	
	t1.add(new Student(22, "Jelsa"));
	t1.add(new Student(23, "Elsa"));
	t1.add(new Student(24, "Jack"));
	t1.add(new Student(25, "Sandy"));
	
	for(Object o:t1) {
		System.out.println(o);
	}
}
}
