package title_case;

public class TitleCaseDemo {

	public static void main(String[] args) {
		String s="hello hi how are you doing today";
		
		String ar[]=s.split(" ");
		
		StringBuilder sb=new StringBuilder();
		
//		for (int i = 0; i < ar.length; i++) {
//			sb.append(ar[i].substring(0,ar[i].length()-1)).append(Character.toUpperCase(ar[i].charAt(ar[i].length()-1))).append(" ");
//		}
		
		for(int i = 0; i < ar.length; i++){
			sb.append(ar[i+1]).append(ar[i]);
		}
		
		System.out.println(sb.toString().trim());

	}

}
