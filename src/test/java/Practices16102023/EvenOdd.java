/**
 * 
 */
package Practices16102023;

import java.util.Scanner;

/**
 * @author user
 *
 */
public class EvenOdd {

	/**
	 * @param args
	 */
	public void getNumber(int n) {
		if(n % 2 != 0) {
			System.out.println("Odd  Number is :: "+ n);
		}
		else {
			System.out.println("Even  Number is :: "+ n);
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int num = sc.nextInt();
		new EvenOdd().getNumber(num);

	}

}
