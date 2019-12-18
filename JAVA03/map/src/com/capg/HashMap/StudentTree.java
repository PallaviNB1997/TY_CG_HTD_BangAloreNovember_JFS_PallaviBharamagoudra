package com.capg.HashMap;

public class StudentTree implements Comparable<StudentTree> {
int age;
String name;
public StudentTree(int age, String name) {
	super();
	this.age = age;
	this.name = name;
}
@Override
public String toString() {
	return "StudentTree [age=" + age + ", name=" + name + "]";
}
@Override
public int compareTo(StudentTree o) {
	
	if(this.age>o.age)
		
		return 1;
	else if(this.age< o.age) 
		return -1;

	else
		return 0;
}

}


