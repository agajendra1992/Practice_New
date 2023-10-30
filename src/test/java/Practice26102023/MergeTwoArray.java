/**
 * 
 */
package Practice26102023;

import java.util.Arrays;

/**
 * @author user
 *
 */
public class MergeTwoArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr1 = { 2, 5, 53, 3, 2 };
		int[] arr2 = { 1, 6, 53, 4, 2 };
		int length = arr1.length + arr2.length;
		int[] mergeArray = new int[length];
		int count = 0;
		for(int ele : arr1) {
			mergeArray[count] = ele;
			count++;
		}
		for(int ele : arr2) {
			mergeArray[count] = ele;
			count++;
		}
		System.out.println(Arrays.toString(mergeArray));
	}

}
