package example1;

public class Demo1 {

	public static void main(String[] args) {
		/*
		 * Data type - asking java to allocate some memory to hold values
		 * 
		 * Java provides 8 primitive data types with default values to it
		 * 
		 * .java serves as instructions for compiler.
		 * .class (byte code) will be the executable.
		 * 
		 * dataType			size			defaultValue
		 * -------------------------------------------------------
		 * byte				1byte			0
		 * short			2bytes			0
		 * int				4bytes			0
		 * long				8bytes			0
		 * 
		 * float			4bytes			0.0000f
		 * double			8bytes			0.0000d in java any decimal values will default to double
		 * 
		 * char				2bytes			'\u00000' (unicode charset) supports 17 country languages
		 * boolean			1bit			false 
		 */
		
		
		int x = 100;	//preferable to long to save memory.
		System.out.println("Value of x = "+x);
		
		float f1 = 12.344f;	//any float must end in an f.
		System.out.println("Value of f1 = "+f1);
		
		double d1 = 889.99;	//use float unless you can't to conserve memory.
		System.out.println("value of d1 = "+d1);
		
		String s = "Quincy";
		System.out.println("Helloooo "+s);
		
		char c = 'H';
		System.out.println("Value of c is "+c);
		
		long l = 1234567890L;	//end with an L (capital preferable).
		System.out.println("Value of l is "+1);
		
		boolean b = true;
		System.out.println("Value of b is "+b);
	}

}
