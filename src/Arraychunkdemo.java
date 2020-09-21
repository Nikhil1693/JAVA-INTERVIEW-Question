import java.util.Arrays;

public class Arraychunkdemo {

	public static void main(String[] args) {
	
	int arr[]= {1,2,3,4,5};	
	chunk(arr,3);	

	}
	
	public static void chunk(int[] a,int size) {
	
		int[] temp=new int[size];
		int index=0;
		System.out.print("{");
		while(index<a.length) {
			temp=Arrays.copyOfRange(a, index, index+size);
			System.out.print("[");
			for(int chunked:temp) {
			System.out.print(chunked);
			
			}
			System.out.print("]");
			index+=size;
		}
		
		System.out.print("}");
		
		/*
		 * for(int chunked:temp) { System.out.print(chunked); }
		 */
	}

}
