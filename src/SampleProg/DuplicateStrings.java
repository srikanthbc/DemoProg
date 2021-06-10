package SampleProg;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateStrings {

	public static void main(String[] args) {
		
		String[] str = {"Java","C","C++","Python","JavaScript","C","Java"};
		
		Map<String,Integer> hMap = new HashMap<String,Integer>();
		
		for(String strEle : str) {
			
			Integer count = hMap.get(strEle);
			if(count == null) {
				hMap.put(strEle, 1);
			}else {
				hMap.put(strEle, ++count);
			}	
		}
		
		Set<Entry<String,Integer>> entSet = hMap.entrySet();
		
		for(Entry<String,Integer> entry :entSet) {
			
			if(entry.getValue()>1) {
				System.out.println("The Duplicate Element is :: "+entry.getKey());
			}
		}
		

	}

}
