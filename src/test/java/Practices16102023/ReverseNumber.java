/**
 * 
 */
package Practices16102023;

/**
 * @author user
 *
 */
public class ReverseNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int number = 12145;
		int reverse = 0;
		while (number != 0) {
			int val = number % 10;
			reverse = reverse * 10 + val;
			number /= 10;

		}
		System.out.println(reverse);
	}

}
