package Pract;

public class RecusrsiveFact {
public static int  f1=0,f2=1,f3;
	public static void main(String[] args) {
		
System.out.print(f1 +" "+ f2);
factorial(10);
	}
	
	
	public static void factorial(int a) {
		if(a<0) {
			return;
		}
		
		f3 = f1 +f2;
		System.out.print(" " +f3);
		f1=f2;
		f2=f3; 
		factorial(--a);
	}
	
	

}
