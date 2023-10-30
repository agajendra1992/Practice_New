/**
 * 
 */
package Practice25102023;

/**
 * @author user
 *
 */
public class ReverseNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num = 744667888;
		int reverse = 0;

		while (num != 0) {
			int val = num % 10;
			reverse = reverse * 10 + val;
			num /= 10;
		}
		System.out.println(reverse);
	}

}
