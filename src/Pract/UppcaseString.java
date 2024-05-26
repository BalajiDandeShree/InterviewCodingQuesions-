package Pract;

public class UppcaseString {

	public static void main(String[] args) {
		String sw = "balaji";
		String s = sw.substring(0,3);
		for(int i = 0;i<s.length();i++) {
			if(i<2) {
				char c = s.charAt(i);
			s = s.replace(c, Character.toUpperCase(c));
			}
		}
		System.out.println(s+sw.substring(3,sw.length()));

	}

}
