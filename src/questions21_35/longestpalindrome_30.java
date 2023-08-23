package questions21_35;

import java.util.HashSet;
import java.util.Scanner;

public class longestpalindrome_30 {
	 public static int longestPalindrome(String s) {
         HashSet<Character>h=new HashSet<>();
        int len=0;
        for(char e:s.toCharArray()){//starts from character go to end of char in the array
            if(h.contains(e)){ //if the first char contains in hash set
                len+=2;
                h.remove(e);
            }
            else
                h.add(e);
        
        }
	 if(h.size()>0){
         return len+1;
     }
     return len;
    
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String s=sc.nextLine();
		longestPalindrome(s);
		System.out.println(longestPalindrome(s));
		
		

	}

}
