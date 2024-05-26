package Pract;

import java.util.Collections;

public class RemoveWhiteSpaceAndReverse {
//A String is given remove the white spaces, reverse it and print the only odd position characters.
	public static void main(String[] args) {
		String str= "java programming is best";
		
		str= str.replace(" ","");
		
		System.out.println(str);
		for(int i=str.length()-1;i>=0;i=(i-2)) {
			
			System.out.println(str.charAt(i));
			
			
		}
		
	}

}
