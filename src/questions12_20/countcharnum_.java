package questions12_20;

import java.util.Scanner;

public class countcharnum_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner sc = new Scanner(System.in);
		System.out.println("original string");
	 	String st=sc.nextLine();
	 	
	 	
	 	int num=0 ,lower=0,upper=0, special=0;
	 	for(int i=0;i<st.length();i++)
	 	{
	 		char ch =st.charAt(i);
	 		if (ch >= 'A' && ch <= 'Z')
                upper++;
            else if (ch >= 'a' && ch <= 'z')
                lower++;
            else if (ch >= '0' && ch <= '9')
                num++;
            else
                special++;
        }
 
        System.out.println("Lower case letters : " + lower);
        System.out.println("Upper case letters : " + upper);
        System.out.println("Number : " + num);
        System.out.println("Special characters : " + special); 		
	}

}
