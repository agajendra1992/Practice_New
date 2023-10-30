package ExamPratice;

import java.util.HashMap;

public class Occurence6 {

	public static HashMap<Character, Integer> getOccurence(String s) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = s.length()- 1; i >= 0; i--) {
			if (map.containsKey(s.charAt(i))) {
				int count = map.get(s.charAt(i));
				map.put(s.charAt(i), ++count);
			} else {
				map.put(s.charAt(i), 1);
			}
		}
		return map;
	}

	public static void main(String[] args) {
		System.out.print(getOccurence("testautomation"));

	}

}
