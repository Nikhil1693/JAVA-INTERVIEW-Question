
public class primewithinRange {

	public static void main(String[] args) {
		
		
		int low=1;
		int high=25;
		
		while(low<high) {
			boolean flag=true;
		
		for(int i=2;i<=low/2;i++) {
			if(low%i==0) {
				flag=false;
				break;
			}
		}
		
		if(flag && low!=0 && low!=1)
			System.out.print(low+" ");
		
		low++;
		}
		
	}
 
}
