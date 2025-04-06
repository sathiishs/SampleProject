package pgm.sam;

public class ReverseByWord {
	
	public static void main(String[] args) {
		
		String s="Have you applied Testing job yesterday ?";
		
		String rev="";
		
		String[] split = s.split("\\s");
		
		for(int i=split.length-1;i>=0;i--) {
			
			rev=rev+split[i];
			rev=rev+" ";
			
			
		}
		System.out.println(rev);
		
		
	}

}
