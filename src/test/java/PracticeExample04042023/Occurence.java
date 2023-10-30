package PracticeExample04042023;

import java.util.HashMap;

public class Occurence {

	public static void main(String[] args) {
		String s = "automationtesting";
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
