
public class DecimaltoBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=10;
		int index=0;
		int []binary=new int[40];
		
		while(n>0) {
			binary[index++]=n%2;
			n=n/2;
			
		}
		for(int i=index-1;i>=0;i--) {
			System.out.print(binary[i]);
		}
		
		

	}

}
