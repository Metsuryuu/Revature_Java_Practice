package strings_demo;

public class eg1 {

	public static void main(String[] args) {

		String s1 = "hello";
		String s2 = "hello";
		String s3 = new String("hello");
		
		System.out.println("s1 address: " + s1.hashCode());
		System.out.println("s2 address: "+s2.hashCode());
		System.out.println("s3 address: "+s3.hashCode());
		
		System.out.println("s1 address: "+System.identityHashCode(s1));
		System.out.println("s2 address: "+System.identityHashCode(s2));
		System.out.println("s3 address: "+System.identityHashCode(s3));
		
		System.out.println("s1==s2 : "+(s1==s2));
		System.out.println("s1==s3 : "+(s1==s3));
		
		System.out.println("s1.equals(s2) : "+s1.equals(s2));
		System.out.println("s1.equals(s3) : "+s1.equals(s3));	//this compares the actual data.
		
		System.out.println("s1.equals(\"HELLO\") : "+s1.equals("HELLO"));
		System.out.println("s1.equals(\"HELLO\") : "+s1.equalsIgnoreCase("HELLO"));
		
		System.out.println("s1.length() : "+s1.length());
		
		System.out.println("Accessing character by character from s1");
		for(int i = 0; i < s1.length(); i++){
			System.out.println(s1.charAt(i));
		}
		
		System.out.println("s1.contains(\"ll\") : "+s1.contains("ll"));
		System.out.println("s1.contains(\"lol\") : "+s1.contains("lol"));	//returns false.
		System.out.println("s1.contains(\"llo\") : "+s1.contains("llo"));	//must be in the proper sequence.
		
		System.out.println("s1.substring(1) : "+s1.substring(1));
		
		String s="hello hi good afternoon";
		String ar[]=s.split(" ");
		for (int i = 0; i < ar.length; i++) {
			if(i%2==0){	//this works with the ASCII.
				System.out.println(ar[i].toUpperCase());
			}else{
				System.out.println(ar[i]);
			}
		}

	}

}
