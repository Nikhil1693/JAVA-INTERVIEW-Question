
public class CharacterCapitalDemo {

	public static void main(String[] args) {
		
		capital("nikhil Aggarwal");
		

	}
	
	public static void capital(String s) {
		
		String[] st=s.split(" ");
		
		StringBuffer sb=new StringBuffer();
		for(String word:st) {
			
			char firstchar=word.charAt(0);
			
			 if(!Character.isUpperCase(firstchar)){
				sb.append(Character.toUpperCase(firstchar)).append(word.substring(1));
			}else {
				sb.append(word.substring(0));
			}
			 sb.append(" ");
		}
		
		String finalsen=sb.toString().trim();
		System.out.print(finalsen);
	}

}
