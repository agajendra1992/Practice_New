/**
 * 
 */
package Practices16102023;

/**
 * @author user
 *
 */
public class DuplicateNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = { 1, 25, 6, 2, 1, 51 };
		for(int i = 0; i<arr.length; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i]== arr[j]) {
					System.out.println(arr[i]+ " ");
				}
			}
		}

	}

}
