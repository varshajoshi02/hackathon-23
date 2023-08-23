package questions12_20;

import java.util.Scanner;

public class palindrome_12 {

	
	public boolean num() {
		int a[]= {1,2,3,2,1};
		for(int i=0; i<a.length/2; i++)
		{
			if (a[i]!= a[a.length-1-i])
			{
				
				return false;
			}
		
		}
		
		 System.out.println(a);
		  return true;
		
		
		
	}
	
		public void word()
		{
			int i;
			String st ,reverse="";
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter string");
		 	 st=sc.nextLine();
		 int Length = st.length();
		 	
		    for ( i=Length-1; i >=0; --i) 
		    {
		       reverse = reverse + st.charAt(i);
		     

		      }
		    if (st.equals(reverse)){
	            System.out.println(st + " is a palindrome.");
		    }
	        else 
	            System.out.println(st + " is not a palindrome.");
		    }
		
	
	
	
	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		
		
int len,temp, i , j;
		
		
	       palindrome_12 obj = new palindrome_12();
	       obj.num();
	      
	       obj.word();
	   

	}

}
