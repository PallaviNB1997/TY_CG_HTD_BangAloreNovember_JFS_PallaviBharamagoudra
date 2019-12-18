package com.tyss.access.pack1;

public  class Student {
protected static String studName;

protected  Student(String name) {
	this.studName=name;
	
}

protected static void studDetails() {
	System.out.println("student name is "+studName);
}
}
