/**
 * 
 */
package Practice25102023;

import java.util.Scanner;

/**
 * @author user
 *
 */
public class EvenOddNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number::");
		int input = sc.nextInt();
		if(input % 2 != 0) {
			System.out.println("Entered Input Number is odd number:: " + input);
		}
		else {
			System.out.println("Entered Input Number is even number:: " + input);
		}

	}

}
