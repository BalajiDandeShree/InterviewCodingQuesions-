package Pract;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ReverseUsingColection {

	public static void main(String[] args) {
	String s = "java";
	char c[] = s.toCharArray();
	List<Character> l = new ArrayList<Character>();
	for(char c1 : c) {
		
		l.add(c1);
	}

	Collections.reverse(l);
	
	for(Character c1 :l) {
		
		System.out.println(c1.charValue());
	}

}
}
