 
public class stepsPyramid {

	public static void main(String[] args) {
		
		steps(3);

	}
	
	public static void steps(int n) {
		int midpoint=((2*n-1)/2);
		for(int i=1;i<=n;i++) {
			char level=' ';
			for(int j=0;j<2*n-1;j++) {
			if(midpoint-i<=j && midpoint+i>=j) {
				level+='#';
				System.out.print(level);
			}
			else {
				level+=' ';
				System.out.print(level);
			}
				
	
	}
			System.out.println();

}
	}
}
