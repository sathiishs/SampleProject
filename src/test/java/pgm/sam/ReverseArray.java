package pgm.sam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArray {
	
	public static void main(String[] args) {
		
		int a[]= {15,25,35,45,55,58,69,84,27};
		
		int b[]=new int[a.length];
		
		for(int i=0;i<a.length;i++) {
			
				b[(a.length-1)-i]=a[i];
				
			
		}
		for (int j=0;j<b.length;j++) {
			System.out.print(b[j]+" ");
			
		}
		System.out.println();
		
		// In Array list
		
		List<Integer> li=new ArrayList<Integer>();
		
		li.add(15);
		li.add(25);
		li.add(35);
		li.add(45);
		li.add(55);
		li.add(58);
		li.add(69);
		li.add(84);
		li.add(27);
		
		
		Collections.reverse(li);
		
		System.out.println(li);
		
	}

}
