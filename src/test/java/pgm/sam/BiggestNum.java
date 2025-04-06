package pgm.sam;

public class BiggestNum {
	
	public static void main(String[] args) {
		
		int a[]= {1,5,8,4,7,2,3,6,9};
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("Biggest no is "+max);
	}

}
