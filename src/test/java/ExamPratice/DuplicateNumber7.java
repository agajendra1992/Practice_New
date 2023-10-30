package ExamPratice;

public class DuplicateNumber7 {

	public static void main(String[] args) {
		int[] arr = { 545, 1, 58, 2, 5, 8, 2, 58, 9, 10 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.print(arr[i] + " ");
				}

			}

		}

	}

}
