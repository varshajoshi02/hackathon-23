package questions21_35;

import java.util.Scanner;

public class diff_string_bool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String s=sc.nextLine();
		try {
		int a;
		
		a= Integer.parseInt(s);
		System.out.println("Interger");
		}
		catch(Exception e)
		{
			
		}
		
		if(s.equalsIgnoreCase("true")||s.equalsIgnoreCase("false"))
		{
			System.out.println("Boolean");
			
		}
		else
			System.out.println("String");
		
		

	}

}
