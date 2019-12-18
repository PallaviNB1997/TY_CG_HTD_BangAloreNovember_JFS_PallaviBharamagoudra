package Employee;

public class Employee {
	String empName;
	int empAge;
	double empSal;
	public Employee(String name,int age,double sal)
	{
		empName=name;
		empAge=age;
		empSal=sal;
	}
	void details()
	{
		System.out.println("name="+empName+"  age="+empAge+"  sal="+empSal);
	}
}
