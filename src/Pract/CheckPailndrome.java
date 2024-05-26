package Pract;

public class CheckPailndrome {
	public static void main(String[] args) {
		String s = "deified";
		int start=0;
		int end = s.length()-1;
		boolean check=true;
		
		while(start<end) {
						
			if(s.charAt(start)!=s.charAt(end)) {
				check=false;
			}
			start=start+1;
			end=end-1;
		}
		if(check==true) {
			System.out.println("String is palindrome");
		}else {
			System.out.println("String is not palindrome");
		}
		
	}
}
