package ExamPratice;

import java.util.HashMap;
import java.util.Map;

public class Occurence9 {

	public static void main(String[] args) {
		String s = "automatiotest";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = s.length() - 1; i >= 0; i--) {
			if (map.containsKey(s.charAt(i))) {
				int count = map.get(s.charAt(i));
				map.put(s.charAt(i), ++count);
			} else {
				map.put(s.charAt(i), 1);
			}
		}
		for(Map.Entry entry : map.entrySet()) {
			System.out.print(entry.getKey()+ " = ");
			System.out.print(entry.getValue()+ ", ");
		}
	}

}
