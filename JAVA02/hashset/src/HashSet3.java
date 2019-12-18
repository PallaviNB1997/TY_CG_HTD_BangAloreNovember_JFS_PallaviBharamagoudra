import java.util.HashSet;

public class HashSet3 {
public static void main(String[] args) {
	HashSet <Student> h1=new HashSet <Student>();
	h1.add(new Student(23,"Anu"));
	h1.add(new Student(23,"Ramesh"));
	h1.add(new Student(23,"divya"));
	h1.add(new Student(23,"divya"));
	
	
	for(Student s1: h1)
{
	System.out.println(s1.StudName+"  and age is   "+ s1.Studage);	
	}
}
}