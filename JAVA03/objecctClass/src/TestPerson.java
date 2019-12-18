
public class TestPerson extends Persson{
	public TestPerson(String name) {
		super (name);
	}
public static void main(String[] args) throws Throwable {
	System.out.println("-------------main started-----------------");
	Persson p1=new Persson("tom");
	p1.finalize();
	p1=null;
	System.gc();
	System.out.println("------main end ed----");
}
}
 