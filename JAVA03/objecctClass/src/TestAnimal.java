import getClass.Class;
import getClass.Dog;

public class TestAnimal {
public static void main(String[] args) {
	Dog d1=new Dog("pinky");
	Class c1=d1.getClass();
//	Dog d2=(Dog) c1.newInstance();
//			
	System.out.println(c1);
//	System.out.println(d2.name);
	
}
}
