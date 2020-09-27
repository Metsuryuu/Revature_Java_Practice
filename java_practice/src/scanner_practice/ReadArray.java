package scanner_practice;

import java.util.Scanner;
import java.util.Arrays;

public class ReadArray {
	
	public Scanner sc = new Scanner(System.in);
	public int ar[];
	
	public ReadArray() {
		System.out.println("Enter the size of array...");
		int n = Integer.parseInt(sc.nextLine());	//this takes the user input. nextLine() is the superior option.
		ar = new int[n];	//give the array the pregiven size.
		
		System.out.println("Please enter "+n+" elements to sort them...");
		for(int i = 0; i<ar.length;i++){
			ar[i]=Integer.parseInt(sc.nextLine());
		}
		
		System.out.println("Printing array...");
		System.out.println(Arrays.toString(ar));
	}	//since this is my constructor, everything happens when a ReadArrays object is made.

	public void sort(int ar[]){
		Arrays.sort(ar);
	}
	


}
