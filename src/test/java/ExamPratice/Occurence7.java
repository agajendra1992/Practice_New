package ExamPratice;

import java.util.HashMap;
import java.util.Map;

public class Occurence7 {

	public static void main(String[] args) {
		String s = "seleniumautomation";
		HashMap<Character, Integer> mapData = new HashMap<Character, Integer>();

		for (int i = s.length() - 1; i >= 0; i--) {
			if (mapData.containsKey(s.charAt(i))) {
				int val = mapData.get(s.charAt(i));
				mapData.put(s.charAt(i), ++val);

			} else {
				mapData.put(s.charAt(i), 1);
			}
		}
//		for (Map.Entry entry : mapData.keySet()) {
//			System.out.println(entry.getKey() + " " + entry.getValue());
//		}
System.out.println(mapData);
	}

}
