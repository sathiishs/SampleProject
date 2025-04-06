package pgm.sam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AnagramPgm {

	
	public static void main(String[] args) {
		
		String s1="silent";
		String s2="listen";
		
		List<Character> li1=new ArrayList<>();
		List<Character> li2=new ArrayList<>();
		for(int i=0;i<s1.length();i++) {
			li1.add(s1.charAt(i));
			
		}
		for(int i=0;i<s2.length();i++) {
			li2.add(s2.charAt(i));
			
		}
		
		System.out.println("Before sorting"+li1);
		Collections.sort(li1);
		System.out.println(li1);
		System.out.println();
		
		System.out.println("Before sorting"+li2);
		Collections.sort(li2);
		System.out.println(li2);
		if(li1.size()==li2.size()) {
			if(li1.equals(li2)) {
				System.out.println("Given strings are anagram");
			}
		}
		else
		System.out.println("Given strings are not anagram");
		
	}
}
