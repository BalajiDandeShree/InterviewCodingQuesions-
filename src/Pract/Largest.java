package Pract;

public class Largest {

	public static void main(String[] args) {
		int a[] = {2,4,3,5,6};
		
		int fl=a[0];
		int sl=a[0];
		
		for(int i = 0;i<a.length;i++) {
			if(fl>a[0]) {
				fl =a[0];
			
			}else if(a[i]>fl && a[i]<sl) {
				sl =a[i];
			}
		}
System.out.println(sl);
	}

}
