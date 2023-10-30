package ExamPratice;

public class MoveEndZero2 {

	public static void moveZero(int arr[]) {
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

	public static void main(String[] args) {
		int[] s = { 1, 2, 0, 3, 4, 5, 0, 4, 6, 9 };
		moveZero(s);

	}

}
