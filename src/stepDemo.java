
public class stepDemo {

	public static void main(String[] args) {
		
		steps(4);

	}
	
	public static void steps(int n) {
		
		for(int i=1;i<=n;i++) {
			for(int j=0;j<i;j++) {
				while(j<i) {
					System.out.print("#");
					break;
				}
				}
			for(int k=i;k<n;k++) {
				while(k<n) {
				System.out.print(" ");
				break;
			}
			}
			
			System.out.println();
		}
	}

}
