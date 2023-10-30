/**
 * 
 */
package Practices16102023;

/**
 * @author user
 *
 */
public class Reverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "automationtest";
		System.out.print("Reverse String is ::");
		for (int i = s.length()- 1; i>= 0; i--) {
			System.out.print(s.charAt(i));
		}

	}

}
