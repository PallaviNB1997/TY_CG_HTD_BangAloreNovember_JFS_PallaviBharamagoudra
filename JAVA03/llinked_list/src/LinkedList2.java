import java.util.LinkedList;

public class LinkedList2 {
	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.add(11);
		l1.add(12);
		l1.add(13);
		l1.add(14);
		l1.add(13);
		System.out.println(l1);
		
		System.out.println("--add first and add last---");
		l1.addFirst(25);
         System.out.println(l1);		
         l1.addLast(35);
         System.out.println(l1);
         
         System.out.println("-----get first and get last----");
         
         l1.getFirst();
         System.out.println(l1);
         l1.getLast();
         System.out.println(l1);
         
         
         System.out.println("-----remove-----");
         l1.remove();
         System.out.println(l1);
         
         System.out.println("----remove first and remove last-----");
         
         l1.removeFirst();
         System.out.println(l1);
         l1.removeLast();
         System.out.println(l1);
         
         
         System.out.println("------remove first occarance and last occarance-------");
         
         
         LinkedList l2=new LinkedList();
         
         l2.add(45);
         l2.add(55);
         l2.add(45);
         l2.add(95);
         l2.add(85);
         l2.add(45);
         System.out.println(l2);
         
         
         l2.removeFirstOccurrence(45);
         System.out.println(l2);
         l2.removeLastOccurrence(45);
         System.out.println(l2);
	}

}
