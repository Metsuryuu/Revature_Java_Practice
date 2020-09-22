package type_casting_example;

public class TypeCastingDemo {

	public static void main(String[] args) {
		/*
		 * TypeCasting?
		 * Conversion of 1 data type to another.
		 * 
		 * 1) Implicit Casting (taken care by the compiler)
		 * 			-When we assign a smaller data type to a larger data type.
		 * 			-All number family are considered as smaller than float and double.
		 */
		
		int x = 1000;	//4bytes
		
		double d1 = x;	//implicit casting done by compiler.
		
		System.out.println("Value of d1 = " + d1);
		
		float f1 = x;	//float is 4 bytes but is considered larger than int.
		
		System.out.println("Value of f1 = " + f1);
		
		char c = 'A';	//2bytes
		
		int y = c;	//4bytes, implicit casting
		System.out.println("Value of y = " + y);
		
		/*
		 * 2) Explicit Casting (Programmer is responsible)
		 * 			-When we convert a larger type to a smaller data type.
		 */
		
		y = 100;	//4bytes
		c = (char)y;	//4bytes to 2bytes, this is explicit casting.
		System.out.println("Value of c after explicit casting is " + c);
		
		float f = 99.88f;
		int z = (int)f;	//this does not round. To do so, add .5 before casting to int.
		System.out.println("Value of z = " + z);

	}

}
