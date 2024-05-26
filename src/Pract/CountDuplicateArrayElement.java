package Pract;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicateArrayElement {
	
	public static void main(String arg[]) {
		int as[] = {23,121,322,45,45};
		
		/*
		 * for(int i = 0; i<as.length-1;i++) {
		 * 
		 * if(as[i]==as[i+1]) { System.out.println("Duplicate number "+ as[i]); } }
		 */
		int count=1;
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int i = 0; i<as.length;i++) {
		
		if(!map.containsKey(as[i])) {
			map.put(as[i], count);
		}else {
			map.put(as[i], map.get(as[i])+1);
		}
		
	}
		
		for(Integer s : map.keySet()) {
			System.out.println(s  + " "+ map.get(s).toString());
		}
	}

}
