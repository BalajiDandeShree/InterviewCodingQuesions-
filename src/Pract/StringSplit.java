package Pract;

public class StringSplit {

	public static void main(String[] args) {
		String s = "TODO Autogenerated method stub";

		String sw[] = s.split(" ");

		/*
		 * for(String e : sw) { System.out.println(e); }
		 */
		int i = 0;

		// Reverse string using String Buffer
		for (String e : sw) {
			StringBuffer sb = new StringBuffer(e);

			sw[i] = sb.reverse().toString();
			i++;
		}

		for (String e : sw) {
			System.out.println(e);
		}

	}

}
