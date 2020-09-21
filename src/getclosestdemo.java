
public class getclosestdemo {

	public static void main(String[] args) {
	
		int arr[]= {1,2,6,8,10,15,16};
		System.out.println(closestdemo(arr,13));

	}
	
	public static int closestdemo(int a[],int b) {
		
		if(a.length==0) 
			System.exit(1);
		if(b<=a[0])
			return a[0];
		if(b>=a[a.length-1])
			return a[a.length-1];
		
		
		int start=0;
		int mid=0;
		int end=a.length-1;
		
		while(end-start!=1) {
			
			mid=(start+end)/2;
			
			if(b==a[mid])
				return a[mid];
			if(b<a[mid])
				end=mid;
			if(b>a[mid])
				start=mid;
		}
		
		return Math.abs(b-a[start])<=Math.abs(b-a[end])?a[start]:a[end];
		
		
	}

}
