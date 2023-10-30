package PracticeExample04042023;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class Occurence1 {

	public static void main(String[] args) {
		String s = "developementAws";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = s.length() - 1; i >= 0; i--) {
			if (map.containsKey(s.charAt(i))) {
				int count = map.get(s.charAt(i));
				map.put(s.charAt(i), ++count);
			} else {
				map.put(s.charAt(i), 1);
			}
		}

		System.out.println(map);
	}

}
