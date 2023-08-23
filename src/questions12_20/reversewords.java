package questions12_20;

import java.util.Scanner;

public class reversewords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int i;
		String  reverse="";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
	 	 String st=sc.nextLine();
String[] st1 =st.split(" ");
	 int Length = st1.length;
	 StringBuilder reverse1= new StringBuilder();
	 	
	    for ( i=Length-1; i >=0; --i) 
	    {
	       reverse1.append(st1[i]);
	     reverse1.append(" ");

	      }
	  
            System.out.println(reverse1 + "reversed");
	    
	


	}
	}


