package exceptions_demo;

public class Exceptions {

	public static void main(String[] args) {

		int a=10;
		int b=0;
		int res=0;
		
		try{	//try catch block as follows.
		res = a/b;
		System.out.println("Result is "+res);
		String s = null;
		System.out.println(s.length());
		}catch(ArithmeticException e){
			System.out.println("Cannot divide by 0.");
		}catch(NullPointerException em){	//you can chain catch statements.
			System.out.println("Something was not initialized properly.");
		}finally{	//not necessary, but, must come last.
			System.out.println("Result is "+res);
		}	//finally block will always happen, regardless of an exception or even an error.
		
		System.out.println("This is other lines of code in my app.");

	}

}
