
public class Persson {
String name;

public Persson(String name) {
	super();
	this.name = name;
}

@Override
public int hashCode() {
	// TODO Auto-generated method stub
	return super.hashCode();
}

//@Override
//public boolean equals(Object obj) {
//	// TODO Auto-generated method stub
//	return super.equals(obj);
//}
//
//@Override
//protected Object clone() throws CloneNotSupportedException {
//	// TODO Auto-generated method stub
//	return super.clone();
//}
//
//@Override
//public String toString() {
//	// TODO Auto-generated method stub
//	return super.toString();
//}

@Override
public void finalize() throws Throwable {
	// TODO Auto-generated method stub
	super.finalize();
	System.out.println("finalize method is called");
}

}
