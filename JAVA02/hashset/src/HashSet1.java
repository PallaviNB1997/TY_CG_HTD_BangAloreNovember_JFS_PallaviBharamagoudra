import java.util.HashSet;

public class HashSet1 {
public static void main(String[] args) {
	HashSet<Integer> hs = new HashSet<Integer>();
	 hs.add(25);
	 hs.add(24);
	 hs.add(23);
	 hs.add(22);
	 hs.add(null);
	 hs.add(null);
	 for(Object object : hs) {
		 System.out.println(object);
	 }
	 
	HashSet <String> hs1= new HashSet<String>();
	hs1.add("tom");
	hs1.add("jerry");
	hs1.add("duck");
	hs1.add(null);
	for (String s1:hs1) {
		System.out.println(s1);
	}
}
}
