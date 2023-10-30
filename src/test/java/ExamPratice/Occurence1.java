package ExamPratice;

import java.util.HashMap;

public class Occurence1 {

	public static void main(String[] args) {
		String a = "Automation";
		HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();

		for (int i = a.length() - 1; i >= 0; i--) {

			if (charCount.containsKey(a.charAt(i))) {
				int count = charCount.get(a.charAt(i));
				charCount.put(a.charAt(i), ++count);
			} else {
				charCount.put(a.charAt(i), 1);
			}
		}
		System.out.println(charCount);
	}

}
