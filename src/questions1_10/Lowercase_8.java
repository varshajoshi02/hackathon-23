package questions1_10;

import java.util.Scanner;

public class Lowercase_8 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string to convert to lower case");
		String st=sc.nextLine();
		String con = st.toLowerCase();
		String con1 = st.toUpperCase();
		
		System.out.println("converted lower case" +con);
		System.out.println("converted lower case" +con1);
		
		
		
	}

}
