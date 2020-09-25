package eg1;

public class SbDemo1 {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("hello");	//can add via constructor.
		System.out.println(sb);
		sb.append(" hey");	//add on to the end.
		System.out.println(sb);
		System.out.println(sb.length());
		sb.insert(2, "JAVA");	//add in at a certain offset.
		System.out.println(sb);
		System.out.println(sb.reverse());
		System.out.println(sb);
		
		sb.delete(3, 8);	//removes position 3-8 (3,4,5,6,7).
		System.out.println(sb);
		
		StringBuffer sb1 = new StringBuffer("JAVA");
		StringBuffer sb2 = new StringBuffer("JAVA");
		
		System.out.println(sb1.equals(sb2));	//this returns false as it compares the addresses.
		//StringBuffer and StringBuilder do not have equals() so they take it from the Object class.
		//this compares the memory, not the data.
		
		System.out.println(sb1.toString().equals(sb2.toString()));//this is true as they are converted to String.
		//note, you can also chain methods like that.
		
	}

}
