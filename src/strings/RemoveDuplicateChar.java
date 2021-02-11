package strings;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Hellothisisprac";
		s=s.toLowerCase();
		System.out.println(s);
		char[] c=s.toCharArray();
		
		String target="";
		
		for(char ch:c) {
			if(target.indexOf(ch)==-1) {
				target+=ch;
			}
		}
		System.out.print(target);
		
		
		      
		     
		      
		    }
		    
		    
		  

	}


