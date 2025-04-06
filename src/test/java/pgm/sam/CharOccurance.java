package pgm.sam;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CharOccurance {
	public static void main(String[] args) {
		
		String s="aabbbbcdd";
		
		char[] c = s.toCharArray();
		
		Map<Character, Integer> hm=new HashMap<Character,Integer>();
		
		for (int i=0;i<s.length();i++) {
			
			if(hm.containsKey(c[i])) {
				hm.put(c[i], hm.get(c[i])+1);
				
			}
			else {
				hm.put(c[i], 1);
				
			}
		}
		
		Set<Entry<Character, Integer>> entrySet = hm.entrySet();
		for (Entry<Character, Integer> entry : entrySet) {
			
			System.out.print(entry.getKey()+""+entry.getValue());
			
		}
		
		
		
	}

}
