package Demo1;

public class Car extends Vehicle {
	
		void carDetails() {
			int cost=80000;
		    System.out.println("cost of car is"+cost);
		    System.out.println("cost of car is"+this.cost);
		    System.out.println("cost of car is"+super.cost);
		
	}
}
