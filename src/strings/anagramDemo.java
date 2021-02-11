package strings;
import java.util.Arrays;
import java.util.HashMap;


public class anagramDemo {

	public static void main(String[] args) {
		String str1="Triangle";
		String str2="Integrall";
		
		
		boolean anagram=Ana(str1,str2);
		System.out.println(anagram);
				

	}
	
	public static boolean Ana(String s1,String s2) {
		
		String lowers1=s1.toLowerCase();
		String []st1=lowers1.split("");
		Arrays.sort(st1,0,st1.length-1);
		String lowers2=s2.toLowerCase();
		String[] st2=lowers2.split("");
		Arrays.sort(st2,0,st2.length-1);
		
				HashMap<String,Integer> hm1=new HashMap<>();
				HashMap<String,Integer> hm2=new HashMap<>();
				
	   for(String word:st1) {
		   if(hm1.containsKey(word)) {
			   hm1.put(word, hm1.get(word)+1);	
			   }
	   else {
		   hm1.put(word, 1);
	   }
	   }
	   
	   
	   for(String word1:st2) {
		   if(hm2.containsKey(word1)) {
			  hm2.put(word1, hm2.get(word1)+1) ;
		   }
		   else {
			   hm2.put(word1,1);
		   }
	   }
	   
	   
	   
	   if(hm1.equals(hm2)) {
		   return true;
		   
	   }else {
		   return false;
	   }
	   
	 
	}

}
