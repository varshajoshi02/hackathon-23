package questions12_20;

import java.util.ArrayList;
import java.util.Scanner;

public class uniquewords {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("original string");
	 	String st=sc.nextLine();
	 	ArrayList<String> list=new ArrayList<String>();
	    String s[]=st.split(" ");
		// TODO Auto-generated method stub
		for (int i = 1; i < s.length; i++) {
		    if (!(list.contains(s[i]))) {
		        list.add(s[i]);
		    }
		}

	    for(int i=0;i<list.size();i++){
	      System.out.println(list.get(i));
	    }
	}

}
