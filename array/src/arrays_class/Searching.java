package arrays_class;

public class Searching {

	public static void main(String[] args) {
		int ar[] = {10,22,33,11,10,10,11,22,44,22};
		
		//search for a specific element.
		int searchElement=44;
		boolean b=false;
		
		for(int i = 0; i < ar.length; i++){
			if(ar[i] == searchElement){
				b = true;
				break;
			}
		}
		
		if(b){
			System.out.println(searchElement + " Found");
		}else{
			System.out.println("Not found.");
		}
		
		//search with position.
		b=false;
		for(int i = 0; i < ar.length; i++){
			if(ar[i] == searchElement){
				b = true;
				System.out.println(searchElement + " found at position "+ ++i);
			}
		}
		if(!b){
			System.out.println("Element not found.");
		}
		
		//even number search.
		System.out.println("Searching all even numbers in array...\n");
		for(int i = 0; i < ar.length; i++){
			if(ar[i] %2 == 0){
				System.out.println(ar[i] + " ");
			}
		}
		
		//prime number search.
		System.out.println("\nSearching for prime numbers...");
		for(int i = 0; i < ar.length; i++){
			
			boolean isprime = true;
			
			for(int j = 2; j <= ar[i]/2; j++){	//no point in going past half of the element.
				if(ar[i]%j == 0){	//would imply a divisor.
					isprime = false;	//if a divisor exists, it is not prime.
					break;	//only need one divisor to disprove primality, no point in continuing.
				}
			}
			
			if(isprime){	//if true, then it is prime.
				System.out.print(ar[i] + " ");
			}
		}
		
		//odd number search.
		System.out.println("\nSearching all odd numbers in array...");
		for(int i = 0; i < ar.length; i++){
			if(ar[i] %2 != 0){
				System.out.print(ar[i] + " ");
			}
		}
		
		//palindrome search.
		System.out.println("\nScanning array to determine palindrome...");
		boolean notpal = false;
		
		for(int i = 0; i <= ar.length/2 && ar.length != 0; i++){
			
			if(ar[i] != ar[ar.length-i-1]){	//check the first and last elements and move inwards.
				notpal = true;
				break;
			}
		}
		
		if(notpal){	//if flag is true, array is not a palindrome.
			System.out.println("The array is not a palindrome.");
		}else{
			System.out.println("The array is a palindrome.");
		}

	}

}
