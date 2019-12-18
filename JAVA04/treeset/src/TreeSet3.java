import java.util.TreeSet;

public class TreeSet3 {
	public static void main(String[] args) {
		EmployeeName e1 = new EmployeeName();
		TreeSet<Employee> t1=new TreeSet<Employee>(e1);
           t1.add(new Employee( "John", 15 ,30000));
           for(Employee employee :t1)
           {
        	   System.out.println(employee.name +" and age is "+employee.age);
           }
	}
}
 