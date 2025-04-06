package pgm.sam;

public class CountOfNonSpaceCharacters {

	
	public static void main(String[] args) {
		
		String s="Count Of The Non Space Charcters in this String";
		int count =0;
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				count++;
			}
			
		}
		System.out.println("The count of character is: "+count);
		
		
		
		
		String a="Hello";
		String b="Worlds";
		
		String ab=a+b; // HelloWorlds
		
		b=ab.substring(0, ab.length()-b.length()); // (0, 11-6)
		
		a=ab.substring(b.length()); // starts from 5
		
		System.out.println("a is: "+a);
		System.out.println("b is: "+b);
		
		String ba=a+" "+b;
		
		System.out.println(ba);
		
	}

}
