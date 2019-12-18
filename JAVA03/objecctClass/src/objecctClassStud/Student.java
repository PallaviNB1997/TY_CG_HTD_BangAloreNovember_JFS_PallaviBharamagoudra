package objecctClassStud;

public class Student {
int StudId;
String StudName;
public Student(int studId, String studName) {
	super();
	this.StudId = studId;
	this.StudName = studName; //alt+shift+S  generete by fields
}
@Override
public String toString() {         //alt+shift+S  generete by tostring
	return "Student [StudId=" + StudId + ", StudName=" + StudName + "]";
}

}
