package questions1_10;

public class Palindrome_ {

	public static boolean main(String[] args) {
		
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
	
	
	
}
