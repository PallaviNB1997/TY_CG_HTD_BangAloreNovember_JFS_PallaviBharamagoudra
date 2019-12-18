
public class Employee implements Comparable<Employee>
{
	
String name;
int age;
int salary;

@Override
public String toString() {
	return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
}

public Employee(String name, int age, int salary) {
	super();
	this.name = name;
	this.age = age;
	this.salary = salary;
}

@Override
public int compareTo(Employee o) {
	if(this.age< o.age)
	{
	return 1;
    }
	if(this.age > o.age)
	{
	return -1;
    }else
    	return 0;
}

}
