package pgm.sam;

public class PrimeNumbers {
	
	public void isPrime(int num) {
		if(num<=1) {
			System.out.println(num+ "is not a prime number");
		}
		
		for(int i=2;i<num/2;i++) {
			if(num%i==0) {
				System.out.println(num+" : is not a prime number");
				break;
				
			}
			else {
				System.out.println(num+" : is a prime number");
			}
			
		}
		
		
	}
	
	public static void main(String[] args) {
		PrimeNumbers pm=new PrimeNumbers();
		pm.isPrime(8);
	}

}
