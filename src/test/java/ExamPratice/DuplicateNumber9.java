package ExamPratice;

public class DuplicateNumber9 {

	public static void main(String[] args) {
		int[] arr = { 11, 1, 89, 90, 11, 90, 20, 12, 1 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					System.out.print(arr[i] + " ");
				}
			}

		}

	}
}