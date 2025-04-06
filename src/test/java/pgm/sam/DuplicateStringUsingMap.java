package pgm.sam;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateStringUsingMap {
	
	public static void main(String[] args) {
		
		String s="Yamaha";
		char[] c = s.toLowerCase().toCharArray();
		
		Map<Character, Integer> hm =new HashMap<Character,Integer>();
		
		for(Character a:c) {
			
			if(hm.containsKey(a)) {
				hm.put(a, hm.get(a)+1);
			}
			else {
				hm.put(a, 1);
			}
			
			}
		
		Set<Entry<Character, Integer>> entrySet = hm.entrySet();
		for(Entry<Character, Integer> entry:entrySet) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey());
				
			}
				
			
			
			}
		}
		
		
		
	}


