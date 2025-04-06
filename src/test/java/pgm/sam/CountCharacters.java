package pgm.sam;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountCharacters {
	
	public static void main(String[] args) {
		// Character count
		/*String s="Java is Object oriented programming language";
		String replace = s.replace(" ","");
		String trim = replace.trim();
		System.out.println(trim.length());*/
		
		String s="aabbbbcddeee";
		
		Map<Character,Integer> hm=new HashMap<Character,Integer>();
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(hm.containsKey(c)){
				hm.put(c, hm.get(c)+1);
				
			}
			else {
				hm.put(c, 1);
			}
		}
		Set<Entry<Character, Integer>> entrySet = hm.entrySet();
		for(Entry en: entrySet ) {
			System.out.print(en.getKey()+""+en.getValue());
			
			
				
		}
		System.out.println();
		System.out.println(hm);
		
		
	}

}
