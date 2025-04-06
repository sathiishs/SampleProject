package pgm.sam;

import java.util.ArrayList;

public class ArrayListsPgm {
	
	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<>();
		
		list.add("sathish");
		list.add("Vimal@1458");
		list.add("45");
		list.add("100");
		list.add("Chennai");
		
		System.out.println(list);
		Object[] array = list.toArray();
		for (Object object : array) {
			System.out.println(object);
			
		}
		
	}

}
