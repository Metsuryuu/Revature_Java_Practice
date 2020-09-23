package arrays_class;

public class InsertArray {

	public static void main(String[] args) {
		
		int ar[] = new int[10];
		ar[0] = 99;
		ar[1] = 201;
		ar[2] = 14;
		ar[3] = 23;
		
		System.out.println("Elements in array");
		int n = 4;	//element count.
		for (int i = 0; i < n; i++) {
			System.out.print(ar[i]+ " ");
			}
		
		int newElement = 100;
		int pos = 1;	//technically 0 for us.
		
		for (int i = n; i >= pos; i--) {
			ar[i] = ar[i-1];
		}
		ar[pos-1] = newElement;	//take their position and subtract one to account for language.
		n++;
		
		System.out.println("\nElements in array");
		for (int i = 0; i < n; i++) {
			System.out.print(ar[i]+ " ");
		}

	}

}
