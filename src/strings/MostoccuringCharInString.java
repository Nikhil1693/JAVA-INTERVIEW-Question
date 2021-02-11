package strings;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MostoccuringCharInString {

	public static void main(String[] args) {
	
		final int ASCII_SIZE=256;


		String s="bbbnananannbb";
		
		int count[]=new int[ASCII_SIZE];
		int len=s.length();
		
		for(int i=0;i<len;i++) 
			count[s.charAt(i)]++;
		
		int max=-1;
		char result=' ';
		
		for(int i=0;i<len;i++) {
			if(max<count[s.charAt(i)]) {
				max=count[s.charAt(i)];
				result=s.charAt(i);
			}
		}
		System.out.println(result);
		
	
	
	}
}
