package scanner_practice;

import java.util.Scanner;

public class Scanners {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);	//only to the console.
		
		//try{
		System.out.println("Enter your name...");
		String name = scan.nextLine();
		
		System.out.println("Enter your age...");
		int age = Integer.parseInt(scan.nextLine());
		
		System.out.println("Enter your salary...");
		double salary = Double.parseDouble(scan.nextLine());
		
		System.out.println("Enter gender(m/f/o)");
		char gender = scan.nextLine().charAt(0);	//this is how you would need to implement char.
//		}catch(ArithmeticException e)){
//			
//		}
		
		System.out.println("Hello "+name);
		System.out.println("Age : "+age);
		System.out.println("Salary : "+salary);
		System.out.println("Gender : "+gender);
		
		//ReadArray r = new ReadArray();

	}

}
