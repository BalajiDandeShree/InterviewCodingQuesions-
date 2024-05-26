package Pract;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class DuplicateCharacterRemove {

	public static void main(String[] args) {
		String sd = "Balaji";
		
		Set <Character>l = new HashSet<Character>();
		for(int i=0;i<sd.length();i++) {
			l.add(sd.charAt(i));
		}
		
		/*
		 * Iterator<Character> f = l.iterator(); while (f.hasNext()) {
		 * System.out.println(f.next()); }
		 */
		
		for(Character fr : l) {
			System.out.println(fr);
		}
		
		
		

	}

}
