package ex3_data_types_objects;

public class Demo {
	
	int x;	//global instance (object).
	int y;	//this will exist in the method only.
	static int z;	//global class level. No object needed to access.

	public static void main(String[] args) {
		
		Demo d1 = new Demo();
		d1.x = 99;
		d1.y = 100;
		z = 99999;	//will be common among in the entire class.
		System.out.println("Printing xyz...");
		d1.printXYZ();
		
		Demo d2 = new Demo();
		d2.x = 9;
		d2.y = 10;
		System.out.println("Printing xyz...");
		d2.printXYZ();	//notice how z remains the same.
		

	}
	
	public void printXYZ() {
		System.out.println("Value of x " + x);
		System.out.println("Value of y " + y);
		System.out.println("Value of z "+ z);
	}

}