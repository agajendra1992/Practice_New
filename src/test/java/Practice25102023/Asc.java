/**
 * 
 */
package Practice25102023;

/**
 * @author user
 *
 */
public class Asc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	int [] arr = {45,2,5,3,23,54,2};
	for(int i = 0; i<arr.length; i++) {
		for(int j = i+1; j<arr.length; j++) {
			if(arr[i]> arr[j]) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		System.out.println(arr[i]+ " ");
	}

	}

}
