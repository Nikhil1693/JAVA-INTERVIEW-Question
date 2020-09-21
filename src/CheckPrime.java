
public class CheckPrime {
	
	public static void main(String[] args) {
		
		
		//System.out.println(primeNumberCheck(13));
		int num=34;
		boolean flag=false;
		
		for(int i=2;i<=num/2;i++) {
			
			if(primeNumberCheck(i)) {
				if(primeNumberCheck(num-i)) {
					System.out.println(num +" = "+i+" + "+(num-i));
					flag=true;
				}
			}
		}
		if(!flag) {
			System.out.println(num+" cannot be expressed as sum of two prime numbers");
		}
		
	}
	
	
	public static boolean primeNumberCheck(int num) {
		
		boolean isPrime=true;
		
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				isPrime=false;
				break;
		}
		}
	
	return isPrime;
	}
		

}
