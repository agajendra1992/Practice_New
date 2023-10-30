/**
 * 
 */
package Practices16102023;

import java.util.HashMap;
import java.util.Map;

/**
 * @author user
 *
 */
public class Ocurrence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "seleniumapiAutomation";
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
