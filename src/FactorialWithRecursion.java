
public class FactorialWithRecursion {

	public static void main(String[] args) {
		int num=4;
		int fact=findFact(num);
		System.out.println(fact);
		
	}
	
	public static int findFact(int num) {
		if(num>=1) {
			return num*findFact(num-1);
		}
		else
			return 1;
		
	}

}
