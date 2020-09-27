package scanner_practice;

import java.util.Scanner;

public class IntString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String res = null;
		String s = null;
		System.out.println("Enter");
		
		try{
			
		int n = Integer.parseInt(sc.nextLine());	//this is going to need to be made into a String.
		s = Integer.toString(n);
		
		}catch(NumberFormatException e){
			
			System.out.println("Enter string again");
			
		}finally{
		
		res = sc.nextLine();
		
		//Output
		System.out.println(res);
		
		}

	}

}
