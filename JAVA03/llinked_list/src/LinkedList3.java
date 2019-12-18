import java.util.LinkedList;

public class LinkedList3 {
public static void main(String[] args) {
	LinkedList l1=new LinkedList();
	l1.add(21);
	l1.add(31);
	l1.add(41);
	l1.add(21);
	l1.add(41);
	System.out.println(l1);
	
	System.out.println("----peek() peekFirst()  peekLast()-------");
	
	
	System.out.println(l1.peek());//peek statement should write within SOP 
	
	System.out.println(l1.peekFirst());
	
	System.out.println(l1.peekLast());
	
	System.out.println("----poll...pollFirst....pollLast-----");
	
	l1.poll();
	System.out.println(l1);
	l1.pollFirst();
	System.out.println(l1);
	l1.pollLast();
	System.out.println(l1);
	
	
	System.out.println("-----offer...offerLast.....offerFirst------");
	
	LinkedList l2=new LinkedList();
	
	l2.add(55);
	l2.add(85);
	l2.add(65);
	l2.add(25);
	l2.add(15);
	System.out.println(l2);
	
	l2.offer(95);
	System.out.println(l2);
	l2.offerLast(35);
	System.out.println(l2);
	l2.offerFirst(001);
	System.out.println(l2);
}
}
