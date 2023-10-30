package ExamPratice;

import java.util.HashMap;
import java.util.Map;

public class Occurence4 {

	public static void main(String[] args) {
		String s = "Selenium";
		HashMap<Character, Integer> countmap = new HashMap<Character, Integer>();

		for (int i = s.length() - 1; i >= 0; i--) {
			if (countmap.containsKey(s.charAt(i))) {
				int count = countmap.get(s.charAt(i));
				countmap.put(s.charAt(i), ++count);
			} else {
				countmap.put(s.charAt(i), 1);
			}
		}
		
		for (Map.Entry entry : countmap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

	}

}
