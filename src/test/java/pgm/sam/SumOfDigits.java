package pgm.sam;

public class SumOfDigits {
	
	public int sumOfNum(int num) {
		
		int sum=0;
		
		while(num!=0) {
			int rem =num%10;
			sum=sum+rem;
			num=num/10;
		}
		return sum;
		
	}
	
	public static void main(String[] args) {
		
		SumOfDigits s=new SumOfDigits();
		System.out.println(s.sumOfNum(4586752));
	}

}
