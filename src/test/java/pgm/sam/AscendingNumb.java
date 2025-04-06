package pgm.sam;

public class AscendingNumb {
	
	public static void main(String[] args) {
		
		int n[]= {105,45,68,47,17,69,52};
		
		for(int i=0;i<n.length;i++) {
			for(int j=i+1;j<n.length;j++) {
				if(n[i]>n[j]) {
					int temp=n[i];
					n[i]=n[j];
					n[j]=temp;
					
				}
			}
		}
		System.out.println(n[n.length-1]);
	}

}
