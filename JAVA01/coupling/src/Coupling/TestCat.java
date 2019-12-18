package Coupling;

public class TestCat {
	public static void main(String ar[]) {
		Cat c1=new Cat();
		Chips c2=new Chips();
		Lays l1=new Lays();
		Bingo l2=new Bingo();
		Kurkure l3=new Kurkure();
		
		c1.feedcat(l1);
		c1.feedcat(l2);
	}

}
