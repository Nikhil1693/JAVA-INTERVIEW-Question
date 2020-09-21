import java.util.Scanner;

public class Calculatorwithswitchcase {

	public static void main(String[] args) {
		
		int num1,num2;
		int result=0;
		char operator;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 1st number:");
		num1=scan.nextInt();
		System.out.println("Enter 2nd number:");
		num2=scan.nextInt();
		
		System.out.println("Enter the operator +,-,*,/");
		operator=scan.next().charAt(0);
		
		scan.close();
		
		switch (operator) {
		case '+':
			result=num1+num2;
			System.out.println(result);
			break;
		case '-':
			result=num1-num2;
			System.out.println(result);
			break;
			
		case '*':
			result=num1*num2;
			System.out.println(result);
			break;
			
		case '/':
			result=num1/num2;
			System.out.println(result);
			break;

		default:
			System.out.println("invalid operator");
		}
		

	}

}
