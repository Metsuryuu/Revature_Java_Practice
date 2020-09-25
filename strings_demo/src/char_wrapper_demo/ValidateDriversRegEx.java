package char_wrapper_demo;

public class ValidateDriversRegEx {

	public static void main(String[] args) {
		String dL = "AE-56781-Y";
		
		if(dL.matches("[A-Z]{2}-[0-9]{5}-[A-Z]{1}")){
			System.out.println("Valid license.");
		}else{
			System.out.println("Invalid license.");
		}
		//compare this to the other ValidateDriver. The length is obscene.
	}

}
