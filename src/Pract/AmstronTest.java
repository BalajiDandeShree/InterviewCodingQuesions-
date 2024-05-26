package Pract;

public class AmstronTest {

	public static void main(String[] args) {
		int num = 153;
		int res = num;
		int x =0;
		int sum=0;
		while(num!=0) {
			x = num%10;
			sum= sum +(x*x*x) ;
			num = num/10;
		}
		System.out.println("Sum is "+sum);
		if(sum==res) {
			System.out.println("Amstrong Number");
		}else {
			System.out.println("Not an Amstrong Number ");
		}

	}

}
