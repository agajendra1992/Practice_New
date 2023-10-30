package Practice09102023;

import java.util.HashMap;

public class Occurence {

	public static void main(String[] args) {
		String s = "automationdeveloper";
		HashMap<Character, Integer> mapValues = new HashMap<Character, Integer>();
		for (int i = s.length() - 1; i >= 0; i--) {
			if (mapValues.containsKey(s.charAt(i))) {
				int count = mapValues.get(s.charAt(i));
				mapValues.put(s.charAt(i), ++count);
			} else {
				mapValues.put(s.charAt(i), 1);
			}
		}

		System.out.println(mapValues);
	}

}
