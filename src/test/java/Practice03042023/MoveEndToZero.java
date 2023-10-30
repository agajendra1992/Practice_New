package Practice03042023;

public class MoveEndToZero {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 0, 3, 9, 0, 1, 2, 5 };
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
