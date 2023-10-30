/**
 * 
 */
package Practice25102023;

import java.util.Scanner;

/**
 * @author user
 *
 */
public class Prime {

	/**
	 * @param args
	 */

	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i < Math.sqrt(n); i++) {
			if (n % 2 == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		if(isPrime(v)) {
			System.out.println(v + " is a prime number");
		}
		else {
			System.out.println(v + " is not a prime number");
		}

	}

}
