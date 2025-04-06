package pgm.sam;

import java.util.Scanner;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		int a=0,b=1,c=0;
		
		Scanner s=new Scanner(System.in);
		System.err.println("Enter How many number to print fibonacci");
		int n = s.nextInt();
		System.out.println(a);
		System.out.println(b);
		
		for(int i=0;i<n;i++) {
			c=a+b;
			a=b;
			b=c;
			
			
			System.out.println(c);
			
		System.out.println();
		}
		
		
	}

}
