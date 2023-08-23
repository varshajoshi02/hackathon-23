package questions1_10;

public class Boolean_1 {

	static boolean a = true;
	static boolean b = false;
	static boolean c = true;
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 if((a && b) || (a && c) || (b && c)) {
	            System.out.println("At least two out of three Booleans are true.");
	        } else {
	            System.out.println("Less than two out of three Booleans are true.");
	        }
		
		

	}

}
