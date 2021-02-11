package strings;

public class vowel {

	public static void main(String[] args) {
		int num=v("Hello");
		System.out.println(num);
	}
	
	public static int v(String s) {
		int count=0;
		String str[]=s.toLowerCase().split("");
		for(int i=0;i<str.length;i++) {
			if(str[i].equals("a") || str[i].equals("o") || str[i].equals("i") || str[i].equals("e") || str[i].equals("u")) {
				count++;
			}
		}
		return count;
	}
}
