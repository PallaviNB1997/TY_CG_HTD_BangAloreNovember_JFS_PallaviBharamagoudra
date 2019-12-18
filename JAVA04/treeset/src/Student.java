
public class Student implements Comparable<Student>{//add unimplemented method
int age;
String name;
public static void main(String[] args) {
	
}
public Student(int age, String name) {
	super();
	this.age = age;
	this.name = name;
}
@Override
public int compareTo(Student o) {
	if(this.age > o.age) {
		return 1;
	}
	else if (this.age < o.age){
		return -1;
	}
	else
	{
	return 0;	
	
	}
	// TODO Auto-generated method stub
	//return "Student[age= "+age +", name= " +name + "]";
}


}

