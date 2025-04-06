package pgm.sam;

public class FindLeapYear {
	
	
	public static boolean isLeap(int num) {
			if(num%4==0) {
				return true;
			}
			else
				return false;
	}
	
	public static void main(String[] args) {
		
		if(isLeap(2028)){
			System.out.println("This is Leap Year");
			
		}
		else {
			System.out.println("This is not Leap Year");
		}
	}

}
