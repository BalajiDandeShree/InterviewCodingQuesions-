package Pract;

public class Fibonacci {

	public static void main(String[] args) {
	
		int f1=0,f2=1;
		int f3;
		System.out.print(f1 + " " + f2 );
		for(int i =0 ; i<5;i++) {
			f3 = f1+f2;
			System.out.print(" "+f3);
			f1=f2;
			f2=f3;
			
		}

	}

}
