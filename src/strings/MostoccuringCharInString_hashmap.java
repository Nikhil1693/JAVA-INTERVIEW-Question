package strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MostoccuringCharInString_hashmap {

	public static void main(String[] args) {


		String s="bananabbbjkjj";
		char[] c=s.toCharArray();
		Map<Character,Integer> hm=new HashMap<Character,Integer>();
		ArrayList<Character> occurance=new ArrayList<Character>();
		int max=0;

		for(char ch:c) {
			if(hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch)+1);
			}
			else {
				hm.put(ch, 1);}
		
		if(hm.get(ch)>max) {
			max=hm.get(ch);
		}
		}
		
		for(Map.Entry<Character,Integer> e:hm.entrySet()) {
			if(e.getValue()==max) {
				occurance.add(e.getKey());
			}
		}
		
		System.out.println(occurance);
		
		
	}

}
