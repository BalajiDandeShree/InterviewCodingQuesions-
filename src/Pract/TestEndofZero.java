package Pract;

public class TestEndofZero {

	public static void main(String arg[]) {
		int temp;
		int a[] = { 1, 45, 0, 4, 5, 0, 1, 4, 0, 3 };
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i]== 0) {
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}

		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

}
/*
 * if(a[i]==0) {
 * 
 * temp = a[i+1]; a[i+1] = a[i]; a[i] = temp;
 * 
 * }
 */