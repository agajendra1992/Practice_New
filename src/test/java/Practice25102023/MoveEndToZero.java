/**
 * 
 */
package Practice25102023;

/**
 * @author user
 *
 */
public class MoveEndToZero {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = { 4, 3, 0, 5, 2, 0, 2, 5, 7 };
		int count = 0;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] != 0) {
				arr[count++] = arr[i];
			}
		}
		while(count<arr.length) {
			arr[count++] = 0;
		}
		
		for(int j = 0; j<arr.length; j++) {
			System.out.print(arr[j] + " ");
		}
	}

}
