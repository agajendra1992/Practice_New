package ExamPratice;

public class MoveEndToZero {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 0, 9, 0, 14, 58, 2, 0, 8, 9, 10 };
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[count++] = arr[i];
			}
			System.out.print(arr[i] + " ");
		}
		while (count < arr.length) {
			arr[count++] = 0;
		}
		System.out.println();
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");
		}
	}

}
