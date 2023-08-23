package questions12_20;

import java.util.Scanner;

public class Duplicate_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		System.out.println("original string");
	 	String st=sc.nextLine();
	 	int count=0;
	 	char a[] =st.toCharArray();
	 	for ( int i=0; i<a.length;i++)
		  {
			  for (int j=i+1; j< a.length;j++)
			  {
				  if (a[i]==a[j])
				  {
					  System.out.println(a[j]);
					  count++;
				  }
			  }
		  }
		
	}

}
