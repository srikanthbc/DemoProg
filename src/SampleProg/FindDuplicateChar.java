package SampleProg;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindDuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "javaprogramminglanguagefortesting";
		char[] strCharArr = str.toCharArray();
		/*Set<Character> cSet = new HashSet<Character>();
		for(char ch :strCharArr) {
			
			if(cSet.add(ch)==false) {
				System.out.println(ch);
			}
		}*/
		
		
		Map<Character,Integer> charMap = new HashMap<Character,Integer>();
		
		for(char chSet : strCharArr) {
			Integer count = charMap.get(chSet);
			if(count == null) {
				charMap.put(chSet, 1);
			}else {
				charMap.put(chSet, ++count);
			}
		}
		Set<Entry<Character,Integer>> entry = charMap.entrySet();
		
		for(Entry<Character,Integer> eSet :entry) {
			
			if(eSet.getValue()>1) {
				System.out.println("The Duplicate Chars are :: "+eSet.getKey() +" and No Of Times Repeated is :: " +eSet.getValue());
			}
		}
		
		
		

	}

}
