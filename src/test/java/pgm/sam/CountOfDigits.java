package pgm.sam;

public class CountOfDigits {
	
	public int countOfNum(int num) {
		
		int count=0;
		
		while(num!=0) {
			
			num=num/10;
			count++;
			
		}
		
		return count;
		
		
	}
	public static void main(String[] args) {
		CountOfDigits c=new CountOfDigits();
		System.out.println(c.countOfNum(453658458));
	}
}
