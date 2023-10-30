package ExamPratice;

import java.util.HashMap;
import java.util.Map;

public class Occurence8 {

	public static void main(String[] args) {
		String s = "seleniumautomation";
		HashMap<Character, Integer> countList = new HashMap<Character, Integer>();
		for(int i = s.length()-1; i>=0; i--) {
			if(countList.containsKey(s.charAt(i))) {
				int count = countList.get(s.charAt(i));
				countList.put(s.charAt(i), ++count);
			}
			else {
				countList.put(s.charAt(i), 1);
			}
		}
		
		System.out.println(countList);

	}

}
