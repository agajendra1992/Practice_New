/**
 * 
 */
package Practice26102023;

/**
 * @author user
 *
 */
public class RemoveNumberFromString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "1234Automation1323";
		String result = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (!Character.isDigit(ch)) {
				result = result + s.charAt(i);
			}

		}
		System.out.println(result.toString());
	}

}
