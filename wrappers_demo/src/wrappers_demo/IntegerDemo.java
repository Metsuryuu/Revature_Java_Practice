package wrappers_demo;

public class IntegerDemo {

	public static void main(String[] args) {
		
		Integer i1=10;
		Integer i2=10;
		Integer i3=new Integer(10);
		
		System.out.println("i1 = i2? : "+(i1==i2));
		System.out.println("i1 = i3? : "+(i1==i3));	//same value, different address.
		i1++;
		System.out.println("i1 = "+i1);
		System.out.println("i2 = "+i2);
		System.out.println("i1.equals(i2) :"+i1.equals(i2));
		System.out.println("i1 = i2? : "+(i1==i2));	//both the address and the value have changed.

	}

}
