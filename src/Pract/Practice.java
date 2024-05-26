package Pract;

import java.util.HashMap;
import java.util.Map;

public class Practice {
	
	public static void main(String arg[]) {
		int a []= {2,4,5,6,5,3};
		/*
		 * int a []= {2,4,5,6,5,3} ; Map<Integer,Integer> map = new
		 * HashMap<Integer,Integer>();
		 * 
		 * for(int i =0;i<a.length;i++) { if(!map.containsKey(a[i])) { map.put(a[i],
		 * a[i]); }else { System.out.println("Duplicate Element" + a[i]); }
		 * 
		 * }
		 */
		 
		  for(int i =0;i<a.length-1;i++) { 
			  
			  for(int j = i+1;j<a.length-1;j++) {
				  if(a[i]==a[j]) {
					  System.out.println(a[i]);
					  				  
		       } 
			  }
			  
			  }
		 
	}
}


/*
 * String s ="Java Program"; int l =s.length(); for(int i = l-1;i>0;i--) {
 * System.out.println(s.charAt(i)); } }
 */
/*
 * for(int i =0;i<a.length;i++) { for(int j =1;j<a.length;j++) if(a[i]==a[j]) {
 * System.out.println(a[i]); } }
 */
