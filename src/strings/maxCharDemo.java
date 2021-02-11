package strings;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class maxCharDemo {

	public static void main(String[] args) {
		
		String s=maxChar("abbcccdddd");
		System.out.println(s);

	}
	
	
	public static String maxChar(String s) {
		
		 String []str=s.split("");
		 String maxkey="";
		 int maxvalue=0;
		 
		 
		 HashMap<String,Integer> hm=new HashMap<>();
		 
		 
		 for(String st:str) {
			
			 if(hm.containsKey(st)) {
				 hm.put(st,hm.get(st)+1);
			 }else {
				 hm.put(st, 1);
			 }
			 
		 }
		 
		 for(Entry<String,Integer> es:hm.entrySet()) {
			 if(es.getValue()>maxvalue) {
				 maxvalue=es.getValue();
				 maxkey=es.getKey();
			 }
		 }
		
		
		return maxkey;
		
		
		
		
		/*
		 * char []c=s.toCharArray(); int count=1; int i,j; char ch[]=new char[10];
		 * 
		 * try { for( i=0,j=0;i<=c.length-1;i++,j++) { if(c[i]==c[i+1]) { count++;
		 * ch[j]=c[i]; } }
		 * 
		 * 
		 * 
		 * }catch(Exception e) { if(count==1){
		 * System.out.println("no repeating character"); } }
		 * 
		 * return ch;
		 */
		
		
		
	}

}
