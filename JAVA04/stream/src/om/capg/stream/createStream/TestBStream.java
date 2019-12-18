package om.capg.stream.createStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TestBStream {
public static void main(String[] args) {
	ArrayList<Integer> a1= new ArrayList<Integer>();
	a1.add(12);
	a1.add(53);
	a1.add(62);
	a1.add(15);
	a1.add(12);
	a1.add(19);
	
	System.out.println("---Filter stream----even-----");
	List<Integer> l1=a1.stream().filter(i-> i%2==0).collect(Collectors.toList());
	System.out.println(l1);
	
	System.out.println("-----stream modify---map---");
	List<Integer> l2=a1.stream().map(i-> i*100).collect(Collectors.toList());
	System.out.println(l2);
	
	System.out.println("----max value------");
	Optional<Integer> a=a1.stream().max((i,j) -> i.compareTo(j)); //Boxing Integer
	System.out.println(a);
	
	System.out.println(a1.parallelStream().count());
}
}
