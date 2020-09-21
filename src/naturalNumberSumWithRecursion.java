
public class naturalNumberSumWithRecursion {

	public static void main(String[] args) {
		
		int num=5;
		int sum=addNum(num);
		System.out.println(sum);
		

	}
	
	public static int addNum(int num) {
		if(num!=0) {
			return num+addNum(num-1);
		}
		else
			return num;
	}

}
