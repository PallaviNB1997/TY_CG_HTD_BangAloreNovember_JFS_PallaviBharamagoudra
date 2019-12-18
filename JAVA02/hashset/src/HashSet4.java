import java.util.HashSet;

public class HashSet4 {
public static void main(String[] args) {
	HashSet <Person> p2=new HashSet <Person>();
	
	p2.add(new Person(22,"anu"));
	p2.add(new Person(22,"manu"));
	p2.add(new Person(22,"ramu"));
	p2.add(new Person(22,"ramu"));
	
	for(Person s:p2) {
		System.out.println("");
	}
}
}
