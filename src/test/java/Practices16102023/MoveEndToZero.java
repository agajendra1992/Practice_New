/**
 * 
 */
package Practices16102023;

/**
 * @author user
 *
 */
public class MoveEndToZero {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = { 1, 7, 0, 3, 6, 9, 0, 5 };
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[i] = arr[count++];
			}
		}
		while (count < arr.length) {
			arr[count++] = 0;
		}
		for (int j = 0; j<arr.length; j++) {
			System.out.println(arr[j]);
		}

	}

}
