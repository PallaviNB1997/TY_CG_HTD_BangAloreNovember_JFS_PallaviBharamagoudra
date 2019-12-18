package CollectionList;

import java.util.ArrayList;
import java.util.Collection;

public class Collection2 {
	public static void main(String[] args) {
		
	
	Collection c1 = new ArrayList();
	//add
	c1.add(12);
	c1.add(23);
	c1.add(25);
	c1.add(98);

	System.out.println(c1);
	
	
	
	Collection c2 = new ArrayList();
	//add
	c2.add(12);
	c2.add(23);
	c2.add(25);
	c2.add(98);

	System.out.println(c2);
	
	System.out.println("-----------------------");
	
	//addAll
	c1.addAll(c2);
	System.out.println(c1);
	System.out.println("--------------------------------");
	
	
	//remove
	Collection c3 = new ArrayList();
	
	c3.add(12);
	c3.add(53);
	c3.add(27);
	c3.add(92);

	System.out.println(c3);
	
	c3.remove(27);
	System.out.println(c3);
	System.out.println("-------------------");
	
	//retainall  only matched datas will be displayed in array..
	c2.retainAll(c3);
	System.out.println(c2);
	System.out.println("-------------------");
	
	//clear 
Collection c4 = new ArrayList();
	
	c4.add(12);
	c4.add(53);
	c4.add(27);
	c4.add(92);

	System.out.println(c4);
	
	c4.clear();
	System.out.println(c3);
	System.out.println("------------");
	
	
	
	//toArray
	Collection c6 = new ArrayList();
	c6.add(12);
	c6.add(23);
	
	Object a[] =c6.toArray();
	
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
	}
	

	
	
	
	
	
	
	
}
}