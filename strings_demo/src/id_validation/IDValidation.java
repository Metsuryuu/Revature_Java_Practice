package id_validation;

public class IDValidation {

	public static void main(String[] args) {

		String dL = "123 456 789";
		String ssn = "123-44-5678";
		String licp = "ABC-1234";
		String zip = "12345";
		
		if(isValidDL(dL)){
			System.out.println(dL + " is a valid license.");
		}else{
			System.out.println(dL + " is an invalid license.");
		}
		
		if(isValidSSN(ssn)){
			System.out.println(ssn+" is a valid Social Security Number.");
		}else{
			System.out.println(ssn+" is an invalid Social Security Number.");
		}
		
		if(isValidLP(licp)){
			System.out.println(licp+" is a valid license plate.");
		}else{
			System.out.println(licp+" is an invalid license plate.");
		}
		
		if(isValidZip(zip)){
			System.out.println(zip+" is a valid area code.");
		}else{
			System.out.println(zip+" is an invalid area code.");
		}

	}
	
	public static boolean isValidDL(String dL){
		if(dL.matches("[0-9]{3} [0-9]{3} [0-9]{3}")){
			return true;
		}else{
			return false;
		}
	}
	
	public static boolean isValidSSN(String ssn){
		if(ssn.matches("[0-9]{3}-[0-9]{2}-[0-9]{4}")){
			return true;
		}else{
			return false;
		}
	}
	
	public static boolean isValidLP(String licp){
		if(licp.matches("[A-Z]{3}-[0-9]{4}")){
			return true;
		}else{
			return false;
		}
	}
	
	public static boolean isValidZip(String zip){
		if(zip.matches("[0-9]{5}")){
			return true;
		}else{
			return false;
		}
	}

}
