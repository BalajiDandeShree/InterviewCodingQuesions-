package Pract;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DuplicateElement {
	public static void main(String arg[]) {
		// TODO: Implement the UniqueNames method.
		/*
		 * When passed two arrays of names, it will return an array containing the names
		 * that appear in either or both arrays. The returned array should have no
		 * duplicates.
		 */
		String[] names1 = new String[] { "Ava", "Emma", "Olivia", "Emma" };
		String[] names2 = new String[] { "Olivia", "Sophia", "Emma", "Sophia" };
		int check = 0;
		String result[] = new String[10];
		
		
   
		for (int i = 0; i < names1.length; i++) {

			for (int j = 0; j < names2.length; j++) {
				if (names1[i].equals(names2[j])) {
					check = 1;
				}

				if (check == 0) {
					result[i] = names1[i];
					result[i+1] = names2[i];
					
				}
				
			}
			check=0;
		}

		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}

		/*
		 * List<String> l1 = new ArrayList<String>(Arrays.asList(names1)); List<String>
		 * l2 = Arrays.asList(names2); l1.addAll(l2);
		 * 
		 * Set<String> s = new HashSet<String>(l1); for(String d:s) {
		 * System.out.println(d); }
		 */

	}

}
