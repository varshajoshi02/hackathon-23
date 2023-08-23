package questions1_10;

import java.util.Scanner;

public class Selection_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int len,temp, i , j;
		
		int a[] = new int [80];
		Scanner scan = new Scanner(System.in);  
        
	       System.out.print("Enter Array Size : ");  
	       len = scan.nextInt();  
	         
	       System.out.print("Enter Array Elements : ");  
	       for(i=0; i<len; i++)  
	       {  
	          a[i] =scan.nextInt() ;  
	       }  
	         
	      
	       for(i=0; i<len; i++)  
	       {  
	           for(j=i+1; j<len; j++)  
	           {  
	               if(a[i] > a[j])  
	               {  
	                   temp = a[i];  
	                   a[i] = a[j];  
	                   a[j] = temp;  
	               }  
	           }  
	       }  
	         
	      // System.out.print("Now the Array after Sorting is :\n");  
	       for(i=0; i<len; i++)  
	       {  
	           System.out.print(a[i]+ "  ");  
	       }  
	   
		
		
		
		

	}

}
