package ExamPratice;

import java.util.HashMap;

public class Occurence {

	public static void main(String[] args) {
		String s = "Selenium";
		HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();
		for (int i = s.length() - 1; i >= 0; i--) {
			if (charCount.containsKey(s.charAt(i))) {
				int count = charCount.get(s.charAt(i));
				charCount.put(s.charAt(i), ++count);
			} else {
				charCount.put(s.charAt(i), 1);
			}
		}
		System.out.println(charCount);
	}

}
