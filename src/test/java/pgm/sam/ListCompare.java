package pgm.sam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListCompare {
			
		public Boolean isMatch() {
		
		List<String> dev=new ArrayList<String>();
		List<String> qa =new ArrayList<String>();
		
		
		dev.add("Iphone");
		dev.add("Nothing");
		dev.add("OnePlus");
		dev.add("Realme");
		dev.add("Redmi");
		dev.add("Samsung");
		dev.add("Vivo");
		
		System.out.println(dev);
		
		qa.addAll(dev);
		Collections.sort(qa);
		System.out.println(qa);
		if(qa == dev) {
			return false;
		}
		else {
			return true;
		}
		
	}
		public static void main(String[] args) {
			ListCompare lc=new ListCompare();
			
			System.out.println(lc.isMatch());
		}

}
