/**
 * 
 */
package Practices16102023;

/**
 * @author user
 *
 */
public class Asc {

	public static void main(String[] args) {
		int[] arr = { 2, 15, 8, 9, 1, 4, 5 };
		for (int i = 0; i <arr.length; i++) {
			for (int j = i + 1; j <arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = 0;
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				
			}
			System.out.print(arr[i]+ " ");
		}

	}

}
