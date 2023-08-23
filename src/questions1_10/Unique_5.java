package questions1_10;

import java.util.Arrays;
import java.util.HashSet;

public class Unique_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a[] = {4,2,2,4,3,5,7};
		
		int len= a.length;
		int count =0;
		
		HashSet<Integer> obj = new HashSet<>();
		for(int i=0; i<len; i++){
		
		 if(!obj.contains(a[i]))
		 {
		 obj.add(a[i]);
		 count++;

	}
}
		System.out.println(obj);
		System.out.println(count-len);
		
}
}

