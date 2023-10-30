/**
 * 
 */
package Practice26102023;

/**
 * @author user
 *
 */
public class AddNumerInString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "133 is greate number 5 & 8";
		int sum = 0;
		String [] s1 = s.split("");
		for (String s2 : s1) {
			try {
				sum = sum + Integer.parseInt(s2);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
		}
		System.out.println(sum);
	}

}
