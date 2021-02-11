
public class binaryToDecimal {

	public static void main(String[] args) {

		double dec=convertbinary(1010);
		System.out.println(dec);

	}
	
	
	public static double convertbinary(int num) {

		double decimal=0.0;
		int i=0;
		while(num!=0) {
		
		int remainder=num%10;
		num=num/10;
		decimal=decimal+remainder*Math.pow(2, i);
		++i;
		
	}
		
	return decimal;

}
}
