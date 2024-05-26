package Pract;

public class MaxAndSecondMax {
	public static void main(String arg[]) {
		int as[] = {23,121,322,45,48};
		
		int min=as[0];
		int smin=as[1];
		
			 for (int num : as) {
		            if (num < min) {
		            	smin = min;
		                min = num;
		            } else if (num > min && num < smin) {
		            	smin = num;
		            }
		        }
			System.out.println("Second Minimum "+smin + " "+ min);
			
			
			/*
			 * for (int num : as) { if (num > min) { smin = min; min = num; } else if (num <
			 * min && num > smin) { smin = num; } }
			 * System.out.println("Second Maximum "+smin+ " "+ min);
			 */
	
	}
}
