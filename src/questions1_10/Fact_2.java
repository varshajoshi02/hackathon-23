package questions1_10;

import java.util.Scanner;

public class Fact_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		=sc.nextLine();*/
		
		int n=5;
		int result =1;
		
		for(int i=1;i<=n;i++) {
			 result *= i;
		}
		System.out.println("factorial " +result);
		
	}

}
