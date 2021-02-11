
public class Singleton {
	
	private static Singleton s=null;
	public String str;
	
	private Singleton() {
		str="Automation";
	}
	public static Singleton getInstance() {
		if(s==null) {
			s=new Singleton();
		}
		return s;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Singleton x=Singleton.getInstance();
		Singleton y=Singleton.getInstance();
		Singleton z=Singleton.getInstance();
		
		x.str=(x.str).toUpperCase();
		
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
	}

}
