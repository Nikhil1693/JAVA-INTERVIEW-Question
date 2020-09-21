
public class fibbi {

	public static void main(String[] args) {
		int a=fib(8);
        System.out.println(a);
	}
	
	public static int fib(int n) {
		
		
			int a=0,b=1;
		
		int arr[]=new int[n+1];
		try {
		for(int i=0;i<=n;i++) {
			arr[i]=a;
			arr[i+1]=b;
			int sum=a+b;
			arr[i+2]=sum;
			a=b;		
			b=sum;
		}
		}catch(Exception e) {
			
		}
		return arr[n];
	}

}
