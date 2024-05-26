package Pract;

public class SumOfDigitsInString {

	public static void main(String[] args) {
		String s = "a0s9Aa7asa3a";
		int sum = 0;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			// System.out.println(ch);
			if (!Character.isAlphabetic(ch)) {
				 int a = Integer.parseInt(String.valueOf(ch));
				sum = sum + a;
			}
		}
		
		System.out.println(sum);
	}

}
/*
 * for (int i = 0; i < s.length(); i++) { char ch = s.charAt(i); if
 * (Character.isDigit(ch)) { sum = sum + (int) ch; } } System.out.println(sum);
 * 
 * }
 */