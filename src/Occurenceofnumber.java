import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class Occurenceofnumber {


public static void main(String[] args) {
	
	int a[]= {1,1,2,4,3,3,7,8,8,9};
	
	ArrayList<Integer> al=new ArrayList<Integer>();
	
	for(int i=0;i<a.length;i++) {
		
		int k=0;
		if(!al.contains(a[i])) {
			al.add(a[i]);
			k++;
			
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j])
					k++;
			}
			System.out.println(a[i]+" -> "+k);
		}
	}
	
	}
}


