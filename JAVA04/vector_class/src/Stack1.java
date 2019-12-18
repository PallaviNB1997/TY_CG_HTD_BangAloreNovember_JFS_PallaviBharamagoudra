import java.util.Stack;

public class Stack1 {
public static void main(String[] args) {
	Stack s1=new Stack();
	s1.add(23);
	s1.add(56);
	s1.push(67);
	System.out.println(s1);
	
	s1.pop(); //removes last element ...... LIFO......
	System.out.println(s1);
	
	System.out.println(s1.peek()); //displays last element
	System.out.println(s1);
	
	System.out.println(s1.search(23)); //in reverse order it will display the position of element ......2
	System.out.println(s1);
	
	System.out.println(s1.search(56)); //......1.....
	System.out.println(s1);
}
}
