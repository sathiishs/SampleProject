package pgm.sam;

public class CountOfCapitalizedWords {
	
	public static int countOfCapWord(String str) {
		
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='A'&&str.charAt(i)<='Z') {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		System.out.println(countOfCapWord("JavaIsObjectOrientedProgrammingLanguage"));
	}

}
