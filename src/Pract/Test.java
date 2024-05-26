package Pract;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Map  <Character,Integer>  map= new HashMap <Character,Integer> ();
		        String s = "swiss";
		        for (int i = 0; i < s.length(); i++) {
		       
		        int count=1;

		        if(!map.containsKey(s.charAt(i))){
		            map.put(s.charAt(i),count);
		        }else {
		            map.put(s.charAt(i),map.get(s.charAt(i))+1);
		        }

		        }
		        for(Entry <Character,Integer> entry : map.entrySet()){

		            System.out.println(entry.getKey() +"=" + entry.getValue());

		        }
		    }
		}


	


