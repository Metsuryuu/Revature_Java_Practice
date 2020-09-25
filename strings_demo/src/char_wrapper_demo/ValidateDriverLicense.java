package char_wrapper_demo;

public class ValidateDriverLicense {

	public static void main(String[] args) {
		/*
		 * First 2 uppercase letters
		 * and a - and
		 * followed by 5 digits
		 * and a - and 1 uppercase letter.
		 * (This is not NY DMV based)
		 */
		String dL="AE-56781-Y";
		boolean b=false;
		if(dL.length()==10 && Character.isUpperCase(dL.charAt(9))&&dL.charAt(8)=='-'){	//position 9 is the tenth character.
			int upper = 0;
			for(int i=0; i<2; i++){
				if(Character.isUpperCase(dL.charAt(i))){
					upper++;
				}
			}
			if(upper==2&&dL.charAt(2)=='-'){
					int digit = 0;
					for(int i=3; i<8; i++){
						if(Character.isDigit(dL.charAt(i))){
							digit++;
						}
					}
					if(digit==5){
						b=true;
					}
			}
		}
		if(b){
			System.out.println(dL+" is a valid license.");
		}else{
			System.out.println(dL+" is an invalid license.");
		}

	}

}
