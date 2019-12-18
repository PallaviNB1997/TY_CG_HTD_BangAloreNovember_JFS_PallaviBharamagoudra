package Interface;

public class Robot implements Moment, Sound{
	
	public void move() {
		System.out.println("Robot is walking");
	}
	public void talk() {
		System.out.println("Robot is talking");
	}

}
