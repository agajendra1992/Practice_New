package PracticeExample04042023;

public class MoveEndZero {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 0, 2, 0, 2, 3, 0, 5, 9 };
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[i] = arr[count++];
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
