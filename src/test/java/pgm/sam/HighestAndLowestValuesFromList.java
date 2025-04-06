package pgm.sam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HighestAndLowestValuesFromList {
	
	public static void main(String[] args) {
		
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
		
		Collections.sort(li);
		
		System.out.println("Lowest value from list is: "+li.get(0));
		System.out.println("Highest value from list is: "+li.get(li.size()-1));
		
	
		
	}

}
