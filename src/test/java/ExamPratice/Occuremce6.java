package ExamPratice;

import java.util.HashMap;
import java.util.Map;

public class Occuremce6 {

	public static void main(String[] args) {
		String s = "seleniumautomation";
		HashMap<Character, Integer> occurenceMap = new HashMap<Character, Integer>();
		for (int i = s.length() - 1; i >= 0; i--) {
			if (occurenceMap.containsKey(s.charAt(i))) {
				int count = occurenceMap.get(s.charAt(i));
				occurenceMap.put(s.charAt(i), ++count);
			} else {
				occurenceMap.put(s.charAt(i), 1);
			}
		}
		System.out.println(occurenceMap);
	}

}
