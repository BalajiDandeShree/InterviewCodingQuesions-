package Pract;

public class LowerTOUpperviceVersa {

	public static void main(String[] args) {
		String s = "abcXYZ";
		String result="";
		
		for(int i = 0; i<s.length();i++) {
			char ch = s.charAt(i);
			if(Character.isLowerCase(ch)) {
				
				result=result+ Character.toUpperCase(ch);
			}if(Character.isUpperCase(ch)) {
				
				result=result+Character.toLowerCase(ch);
			}
		}
		
		System.out.println(result);

	}

}
