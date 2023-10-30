package Practice09102023;

public class MoveEndZero {

	public static void main(String[] args) {
		int[] arr = { 1, 02, 5, 0, 6, 9, 4, 0, 59, 6 };
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[count++] = arr[i];
			}
		}
		while (count < arr.length) {
			arr[count++] = 0;
		}
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");
		}
	}

}
