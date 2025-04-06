package pgm.sam;

public class ArmStrongNumber {

	
	public boolean isArmStrong(int num) {
		int a=0;
		int arm=num;
		
		while(num!=0) {
			int rem=num%10;
			a=a+(rem*rem*rem);
			num=num/10;
			
		}
		if(a==arm) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		ArmStrongNumber am=new ArmStrongNumber();
		System.out.println(am.isArmStrong(153));
		
	}
}
