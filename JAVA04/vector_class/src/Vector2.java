import java.util.Vector;

public class Vector2 {
public static void main(String[] args) {
	Vector v1=new Vector();
	System.out.println(v1.size());
	System.out.println(v1.capacity());
	
	v1.add(23);
	v1.add(56);
	v1.add(78);
	v1.add(100);
	System.out.println(v1.size());
	System.out.println(v1.capacity());
	
	v1.trimToSize(); //fit to the size
	System.out.println(v1.size());
	System.out.println(v1.capacity());
	
	v1.setSize(10); //set new size
	System.out.println(v1.size());
	System.out.println(v1);
	
	v1.add(200); //adds to the last index
	System.out.println(v1.size());
	System.out.println(v1);
	
	v1.set(5, 600);  //replaces the index element that is modification
	System.out.println(v1);

	
}
}
