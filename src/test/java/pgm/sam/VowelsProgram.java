package pgm.sam;

public class VowelsProgram {
	
	public static void findVowels() {
		String s="Vowels Program";
		String vowels="";
		char[] c = s.toLowerCase().toCharArray();
		
		for(int i=0;i<s.length();i++) {
			
			if(c[i]=='a'||c[i]=='A'||c[i]=='e'||c[i]=='E'||c[i]=='i'||c[i]=='I'||c[i]=='o'||c[i]=='O'||c[i]=='u'||c[i]=='U') {
				vowels=vowels+c[i];
				
			}
			
		}
		System.out.println(vowels);
		
		}
	
	public static boolean isVowel(String st) {
		boolean matches = st.toLowerCase().matches(".*[aeiou].*");
		return matches;
		
	}
	
	public static void main(String[] args) {
		//findVowels();
		
		if(isVowel("VowelProgram")) {
			System.out.println("Vowels present");
		}
		else {
			System.out.println("Vowels not present");
		}
	}
	
	
	

}
