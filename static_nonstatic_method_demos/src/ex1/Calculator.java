package ex1;

public class Calculator {
	
	public static void calculatorStatic() {
		System.out.println("Hello from Calculator's class calculatorStatic()");
	}
	
	public void calculatorNonStatic() {
		System.out.println("Hello from Caluculator's class calculatorNonStatic()");
	}
	
	public int add(int a, int b) {	//just like Cpp, Python, etc.
		return a + b;
	}

}
