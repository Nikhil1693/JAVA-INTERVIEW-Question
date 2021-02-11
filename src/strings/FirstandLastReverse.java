
package strings;

public class FirstandLastReverse {

	public static void main(String[] args) {
		
		String s="My name is nikhil";
		reverse(s);
		

	}
	
	public static void reverse(String str) {
		
		String[] s=str.split(" ");
		
		//StringBuilder sb=new StringBuilder();
		for(int i=0;i<s.length;i++) {
			if(i==0 || i==s.length-1) {
				int len=s[i].length();
				String temp="";
				 for(int j=len-1;j>=0;j--) {
					 
					 temp=temp+s[i].charAt(j);
					 }
				 s[i]=temp;
				
			}
		}
		for(int k=s.length-1;k>=0;k--) {
			System.out.print(s[k]+" ");
		}
	}

}
