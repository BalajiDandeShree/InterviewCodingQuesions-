package Pract;

public class MinMax {
	public static void main(String[] args) {
		
		int a[]= {4,54,32,1};
		int min =a[0];
		int max = a[0];
		for(int i=0;i<a.length;i++) {
			
			if(min>a[i]) {
				min=a[i];
			}
			if(max<a[i]) {
				max=a[i];
			}
		}
		System.out.println(min);
		System.out.println(max);
		int smin = a[0];
		
		for(int s : a) {
			
			if(s<min) {
				smin = min;
				min=s;
			} else if(s>min && s<smin){
				smin = s;
			}
		}
		
		System.out.println(min + "  " + smin);
	}
	
	
	

}
