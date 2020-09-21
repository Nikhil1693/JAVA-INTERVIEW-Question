import java.util.ArrayList;

public class prog1 {

	public static void main(String[] args) {

		
		ArrayList<Integer> a=storemultipleInArray();
		System.out.print(a);
		int sum=sumofMultiples(a);
		System.out.println();
		
		System.out.println("sum is-->"+sum);

	}
	public static int sumofMultiples(ArrayList<Integer> b) {
		int s=0;
		for(int i=0;i<b.size();i++) {
			s+=b.get(i);
		}
		return s;
		
	}
	
	public static ArrayList<Integer> storemultipleInArray() {
		
		ArrayList<Integer> multiple=new ArrayList<Integer>();
		for(int i=1;i<10;i++) {
			
			if((i%3==0) || (i%5==0)) {
				multiple.add(i);
			}
		}
		return multiple;
		
	}

}
