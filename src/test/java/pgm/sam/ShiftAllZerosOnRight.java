package pgm.sam;

import java.util.Arrays;

public class ShiftAllZerosOnRight {
	
	public static void main(String[] args) {
		
		int a[]= {1,0,7,0,4,0,5,0,0,8,6,9,1,2,0};
		
		int b[]=new int[a.length];
		
		int j=0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				if(b[j]==0) {
				b[j]=a[i];
				j++;
				}
				
				
			}
			}
		System.out.println(Arrays.toString(b));
	}

}
