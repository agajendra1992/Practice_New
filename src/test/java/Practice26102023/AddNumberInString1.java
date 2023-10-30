/**
 * 
 */
package Practice26102023;

/**
 * @author user
 *
 */
public class AddNumberInString1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "1212 is test 3 & 5";
		int result = 0;
		String[] arr = s.split("");

		for (String s2 : arr) {
			try {
				result = result + Integer.parseInt(s2);
			} catch (NumberFormatException e) {
			}
		}
		System.out.println(result);

	}

}
