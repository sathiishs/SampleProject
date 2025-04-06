package pgm.sam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapToArrayList {
	
	public static void main(String[] args) {
		
		Map<String,String> hm=new HashMap<>();
		
		hm.put("Yamaha", "Crux");
		hm.put("Suzuki", "Hayate");
		hm.put("Honda", "Unicorn");
		hm.put("Tvs", "Apache");
		hm.put("Hero", "CBZ");
		hm.put("Bajaj", "Pulsar");
		
		ArrayList<String> list1=new ArrayList<>(hm.keySet());
		Collections.sort(list1);
		for(String s:list1) {
			System.out.println(s);
			
		}
		
		ArrayList<String> list2=new ArrayList<>(hm.values());
		Collections.sort(list2);
		for(String s:list2) {
			System.out.println(s);
			
		}
		Collection<String> synchronizedCollection = Collections.synchronizedCollection(list1);
		for(String coll:synchronizedCollection) {
			
			System.out.println(coll);
		}
		
	}

}
