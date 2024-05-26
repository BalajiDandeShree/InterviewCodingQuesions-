package Pract;

public class PerfectNumber {

	public static void main(String[] args) {
		int num=28;
		//6 has proper divisors 1, 2 and 3, and 1 + 2 + 3 = 6, so 6 is a perfect number.
         int sum=0;
		for(int i = 1;i<num;i++) {
			if(num%i==0) {
				System.out.println(i);
				sum = sum+i;
			}
		}
		
		if(sum==num) {
			System.out.println("Perfet Number");
		}else {
			System.out.println("Not a Perfet Number");
		}

	}

}
