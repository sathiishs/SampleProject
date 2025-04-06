package pgm.sam;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateNumberInArray {
	
	public static void main(String[] args) {
		
		int[] a = { 3, 2, 1, 1, 2, 2, 3, 2, 1, 3 };
		for(int i=0;i<a.length;i++) {
			int count=1;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					a[j]=0;
					count++;
					
				}
			}
			if(count>1 && a[i]!=0) {
				System.out.println(a[i]);
			}
			
		}
		
	}

	}
