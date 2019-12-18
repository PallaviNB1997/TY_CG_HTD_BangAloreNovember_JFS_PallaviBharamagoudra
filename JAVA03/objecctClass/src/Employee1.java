
public class Employee1 {
int Id;
String name;
public Employee1(int id, String name) {
	super();
	Id = id;
	this.name = name;
}
@Override
public int hashCode() {
	return 10;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee1 other = (Employee1) obj;
	if (Id != other.Id)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
}





}
