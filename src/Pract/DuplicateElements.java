package Pract;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElements {
	public static void main(String[] args) {
		
		String[] names1 = new String[] { "Ava", "Emma", "Olivia", "Emma" };
		String[] names2 = new String[] { "Olivia", "Sophia", "Emma", "Sophia" };
		List<String> s = new ArrayList<String>(Arrays.asList(names1));
		List<String> s1 = new ArrayList<String>(Arrays.asList(names2));
		s.addAll(s1);
		

		Set<String> f1 = new HashSet<String>(s);
		
	
	for(String d: f1) {
		System.out.println(d);
	}
		
		 
		
	}
}
