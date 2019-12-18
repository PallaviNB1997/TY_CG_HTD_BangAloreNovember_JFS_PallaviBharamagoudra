import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet1 {
public static void main(String[] args) {
	LinkedHashSet l1 = new LinkedHashSet();
	l1.add(12);
	l1.add(44);
	l1.add(64);
	l1.add(44);
	l1.add(null);
	
	Iterator itr = l1.iterator();
	while (itr.hasNext()) {
		System.out.println(itr.next());
	}
	
	
	LinkedHashSet<Integer> l2 = new LinkedHashSet<Integer>();
	l1.add(22);
	l1.add(24);
	l1.add(24);
	l1.add(24);
	l1.add(null);
	
	Iterator<Integer> itr1 = l2.iterator();
	while (itr1.hasNext()) {
		System.out.println(itr1.next());
	}
}




}
