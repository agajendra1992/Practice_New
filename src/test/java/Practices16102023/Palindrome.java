/**
 * 
 */
package Practices16102023;

/**
 * @author user
 *
 */
public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String OriginalString = "dad";
		String reverseString = "";

		for (int i = OriginalString.length() - 1; i >= 0; i--) {
			reverseString = reverseString + OriginalString.charAt(i);

		}
		
		if(OriginalString.equals(reverseString)) {
			System.out.println(reverseString+ ":: is a palindrome");
		}
		else {
			System.out.println(reverseString+ ":: is not a palindrome");
		}

	}

}
