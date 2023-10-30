/**
 * 
 */
package Practice25102023;

import java.util.Scanner;

/**
 * @author user
 *
 */
public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:: ");
		String originalString = sc.next();
		String reverseString= "";
		for (int i = originalString.length() - 1; i >= 0; i--) {
			 reverseString = reverseString+ String.valueOf(originalString.charAt(i));
		}
		if (originalString.equals(reverseString)) {
			System.out.println(originalString + " is a palindrome");
		} else {
			System.out.println(originalString + " is not a palindrome");
		}
	}

}
