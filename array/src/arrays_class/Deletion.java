package arrays_class;

public class Deletion {
	
	public static void main(String[] args) {
		
		int ar[] = new int[10];
		ar[0] = 99;
		ar[1] = 201;
		ar[2] = 14;
		ar[3] = 23;
		
		System.out.println("Elements in array");
		int n = 4;	//element count.
		/*
		 * This can be obtained by a for loop, just have a condition to check
		 * for trailing 0s. For instance, if ar[i] == 0, if ar[i+1] == 0, break
		 * else continue.
		 */
		for (int i = 0; i < n; i++) {
			System.out.print(ar[i]+ " ");
			}
		
		int pos = 2;	//delete position 2 (technically 1.
		
		for(int i = pos-1; i < n; i++){
			ar[i] = ar[i+1];
		}
		n--;	//fewer elements in the array.
		
		System.out.println("\nElements in array after deletion");
		for (int i = 0; i < n; i++) {
			System.out.print(ar[i]+ " ");
		}
	}

}
