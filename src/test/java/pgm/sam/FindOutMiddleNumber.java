package pgm.sam;

import java.util.ArrayList;
import java.util.List;

public class FindOutMiddleNumber {
	
	public void findMiddleValue(int[] num) {
		
		if((num.length)%2==0) {
			System.out.println("Number Array length are even...unable to find middle value ");
		}
		else {
			System.out.println(num[((num.length)/2)]);
		}
		
	}
	
	public void listArray() {
		
		List<Integer> li1=new ArrayList<Integer>();
		
		li1.add(15);
		li1.add(25);
		li1.add(75);
		li1.add(85);
		li1.add(68);
		li1.add(45);
		li1.add(57);
		li1.add(64);
		li1.add(72);
		
		System.out.println(li1.get((li1.size())/2));
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		FindOutMiddleNumber f =new FindOutMiddleNumber();
		
		int[] a= {15,25,75,85,68,45,57,64,72};
		
		//f.findMiddleValue(a);
		f.listArray();
	}

}
