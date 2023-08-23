package questions12_20;

import java.util.Scanner;

public class removechar_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("original string");
	 	String st=sc.nextLine();
		
		st= st.replaceAll("a","" );
		System.out.println("replaced string" +st);

	}

}
