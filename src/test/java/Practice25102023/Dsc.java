/**
 * 
 */
package Practice25102023;

/**
 * @author user
 *
 */
public class Dsc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	int [] arr = {4,2,14,54,1,6,78};
	for(int i = 0; i<arr.length; i++) {
		for(int j = i+1; j<arr.length; j++) {
			if(arr[i]<arr[j]) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		System.out.println(arr[i] + "  ");
	}

	}

}
