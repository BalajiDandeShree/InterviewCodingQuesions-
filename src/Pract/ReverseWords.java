package Pract;

public class ReverseWords {

	public static void main(String[] args) {
		String s = "we are learning java";
		String s1[] = s.split(" ");
		for(int i=s1.length-1;i>=0;i--) {
			StringBuffer s2 = new StringBuffer(s1[i]);
			System.out.println(s2.reverse());
		}
		

	}

}
