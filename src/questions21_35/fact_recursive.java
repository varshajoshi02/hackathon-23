package questions21_35;

import java.util.Scanner;

public class fact_recursive {
	
	
	static int fact (int n)
	{
		int output;
		
		if(n==1) {
			return 1;
		}
		output= fact(n-1)*n;
		return output;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		
		int factor = fact(num);
		System.out.println(factor);

	}

}
