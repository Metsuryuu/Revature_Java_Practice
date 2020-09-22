package ex4;

public class Student {
	
	int id;
	String name;
	int age;
	public final static String COLLEGE="Revature College";	//final should be caps.
	//this will be accessible everywhere and cannot be changed.
	
	public void printStudent() {
		System.out.println("Student ID : "+id);
		System.out.println("Student Name : " + name);
		System.out.println("College Name : " + COLLEGE);
	}

}
