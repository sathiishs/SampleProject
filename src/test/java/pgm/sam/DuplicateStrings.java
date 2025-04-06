package pgm.sam;

import java.util.HashSet;
import java.util.Set;

public class DuplicateStrings {
	
	public static void main(String[] args) {
		
		String s= "Yamaha";
		
		char[] c = s.toCharArray();
		
		for(int i=0;i<s.length();i++) {
			int count=1;
			for(int j=i+1;j<s.length();j++){
				if(c[i]==c[j]) {
					c[j]='X';
					count++;
											
				}
			}
			if(count>1&&c[i]!='X') {
				System.out.println(c[i]);
			}
			
		}
		
		
			
		}
		

	}


