package Pract;

public class ReverseNumber {

	public static void main(String[] args) {
		int a=45115;
		int x =0;
		int result=0;
		while(a!=0) {
			x = a%10;
			result = result*10+x;
			System.out.println(x);
			a=a/10;
		}
		
		System.out.println(result);

	}

}
