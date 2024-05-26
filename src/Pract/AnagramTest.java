package Pract;

import java.util.Arrays;

public class AnagramTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "listen";
        String str2 = "silent";
	        // Remove spaces and convert strings to lowercase for case-insensitive comparison
	        str1 = str1.replaceAll("\\s", "").toLowerCase();
	        str2 = str2.replaceAll("\\s", "").toLowerCase();

	        // Check if lengths are equal
	        

	        // Convert strings to character arrays and sort them
	        char[] charArray1 = str1.toCharArray();
	        char[] charArray2 = str2.toCharArray();
	        Arrays.sort(charArray1);
	        Arrays.sort(charArray2);
	        
     
	        

	        if (str1.equals(str2)) {
	            System.out.println(str1 + " and " + str2 + " are anagrams.");
	        } else {
	            System.out.println(str1 + " and " + str2 + " are not anagrams.");
	        }
	 

	}

}
