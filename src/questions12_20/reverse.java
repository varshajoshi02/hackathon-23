package questions12_20;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		int i;
		String st ,reverse="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
	 	 st=sc.nextLine();
	 	
	 int Length = st.length();
	 	
	    for ( i=Length-1; i >=0; --i) 
	    {
	       reverse = reverse + i;
	     

	      }
	  
            System.out.println(reverse + "reversed");
	    
	


	}

}
