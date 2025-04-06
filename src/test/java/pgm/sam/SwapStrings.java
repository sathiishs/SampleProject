package pgm.sam;

public class SwapStrings {
	
	public static void main(String[] args) {
		
		String a="Selenium";
		String b="Java";
		
		a=a+b; // SeleniumJava
		
		b=a.substring(0, a.length()-b.length()); // (0, 12-4)
		
		a=a.substring(b.length());//index starts from 8 to till last char
		
		System.out.println(a);
		System.out.println(b);
		
		// Using temp
		
		String temp;
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println(a);
		System.out.println(b);
		
	}

}
