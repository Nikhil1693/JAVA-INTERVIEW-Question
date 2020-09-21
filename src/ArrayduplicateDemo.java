
public class ArrayduplicateDemo {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,2,4,5,4,5};
		duplicate(arr);

	}
	
	public static void duplicate(int[] a) {
		
		
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.print(a[j]+",");
				}
			}
			
		}
	}

}
