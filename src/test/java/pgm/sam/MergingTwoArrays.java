package pgm.sam;

import java.util.Arrays;

public class MergingTwoArrays {
	
	public static void main(String[] args) {
		
		int a[]= {15,25,35};
		int b[]= {20,30,40};
		
		int al = a.length;
		int bl = b.length;
		int ab[]=new int[al+bl];
		
		System.arraycopy(a, 0, 	ab, 0, al);
		System.arraycopy(b, 0, ab, al, bl);
		
		System.out.println(Arrays.toString(ab));
		
	}

}
