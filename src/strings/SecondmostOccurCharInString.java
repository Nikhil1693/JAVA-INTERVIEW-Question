package strings;

public class SecondmostOccurCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int ASCII_SIZE=256;
		
		String s="nbbnananannbbb";
		
		int count[]=new int[ASCII_SIZE];
		int len=s.length();
		int i;
		
		for(i=0;i<len;i++)
			count[s.charAt(i)]++;
		
		int first=0,second=0;
		
 		for(i=0;i<ASCII_SIZE;i++) {
			if(count[i]>count[first]) {
				second=first;
				first=i;
			}else if(count[i]>count[second] && count[i] != count[first])
				second=i;
			
		}
		
		
		System.out.println((char)second);
		
		

	}

}
