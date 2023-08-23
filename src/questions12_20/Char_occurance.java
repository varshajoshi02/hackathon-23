package questions12_20;

import java.util.Scanner;

public class Char_occurance {

	public int incount() {
		Scanner sc = new Scanner(System.in);
		System.out.println("original string");
	 	String st=sc.nextLine();
		int count=0;
	 	char c = 0;
	 	for ( int i=0; i<st.length();i++)
		  {
	 		if(st.charAt(i) == c) {
	            count++;
		  }

	}
	 	return count;
	}
	
	
	
	public static  int main(String[] args) {
		// TODO Auto-generated method stub
		
		
	 	Char_occurance obj= new Char_occurance();
	 	 obj.incount();

	
	}
}
