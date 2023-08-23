package questions12_20;

import java.util.Scanner;

public class repeatednumchar_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("original string");
	 	String st=sc.nextLine();
	 	
	 	
	 	int num=0 ,lower=0,upper=0, special=0 ,count=0,count1 =0;
	 	 for( int i=0; i<st.length();i++){
             if(Character.isUpperCase(st.charAt(i)))
                 count++;
             if(Character.isLowerCase(st.charAt(i))) 
             count1++;
          
         }
             System.out.println(count);
             System.out.println(count1);
	}

}
