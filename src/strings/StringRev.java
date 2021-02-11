package strings;

public class StringRev {
	
	public static String reverse(String str) {
		
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		return rev;
	}
	
	
	
	

	public static void main(String[] args) {
		
		String s="nikhil";
		
		String r=reverse(s);
		System.out.println(r);
		

	}

}
