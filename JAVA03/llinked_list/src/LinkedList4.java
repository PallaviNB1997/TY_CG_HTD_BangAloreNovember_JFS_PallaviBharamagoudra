import java.util.LinkedList;

public class LinkedList4 {
public static void main(String[] args) {
	LinkedList l1=new LinkedList();
	
	l1.add(91);
	l1.add(75);
	l1.add(95);
	l1.add(91);
	l1.add(83);
	System.out.println(l1);
	
	System.out.println("-----push.....pop.....element--------");
	l1.push(11);
	System.out.println(l1);
	
	l1.pop();
	System.out.println(l1);
	System.out.println(l1.element()); //displays first element
	System.out.println(l1);
}
}
