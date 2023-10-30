package ExamPratice;

import java.util.Map;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.collections4.map.HashedMap;

public class Occurence5 {

	public static void main(String[] args) {
		String s = "testautomation";
		HashMap<Character, Integer> valuelist = new HashMap<Character, Integer>();
		for(int i =s.length()-1; i>=0; i--) {
			if(valuelist.containsKey(s.charAt(i))) {
				int count = valuelist.get(s.charAt(i));
				valuelist.put(s.charAt(i), ++count);
			}
			else {
				valuelist.put(s.charAt(i), 1);
			}
		}
		
		for (Map.Entry entry : valuelist.entrySet()) {
			System.out.print(entry.getKey() + " : " + entry.getValue()+",");
		}
	}

}
