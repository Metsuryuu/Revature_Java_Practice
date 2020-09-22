package ex4;

public class StudentMain {

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.id = 100;
		s1.name = "Xavier";
		s1.age = 33;
		//Student.college = "My College"; Invalid because of final keyword.
		
		System.out.println("Printing Student s1");
		s1.printStudent();
		
		Student s2 = new Student();
		s2.id = 101;
		s2.name = "Chris";
		s2.age = 30;
		
		System.out.println("Printing Student s2");
		s2.printStudent();
		
	}

}
