package Pract;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicateString {

	public static void main(String[] args) {
		String s[] = {"asa","asa","dfd","df","df",};
		int count=0;
		Set<String> sw = new HashSet<String>();
		for(int i =0 ; i<s.length;i++) {
			if(sw.add(s[i])){
				
			}else {
				count ++;
			}
		}
		Iterator <String> d = sw.iterator();
		while (d.hasNext()) {
			System.out.println(d.next());
			
		}
		System.out.println(count);

	}

}
