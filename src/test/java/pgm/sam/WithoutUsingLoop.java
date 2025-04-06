package pgm.sam;

public class WithoutUsingLoop {
	
	public static void printNum(int n) {
		
		if(n<=100) {
			System.out.println(n);
			n++;
			printNum(n);
		}
		
		
		}
		

	
	public static void main(String[] args) {
		
		printNum(1);
		
		
	}	

}
