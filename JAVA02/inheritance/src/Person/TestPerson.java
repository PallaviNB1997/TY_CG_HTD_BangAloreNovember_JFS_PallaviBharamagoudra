package Person;

public class TestPerson {
	public static void main(String ar[]) {
		Person p1=new Person();
		p1.name="Tom";
	p1.age=23;
	p1.personDetails();
	Person p2=new Person();
	p2.initialize(23,"Jerry");
	p2.personDetails();
	}

}
