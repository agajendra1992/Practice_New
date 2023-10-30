package ExamPratice;

public class DuplicateNumber8 {

	public static void main(String[] args) {

		int[] arr = { 22, 12, 13, 12, 122, 44,122 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.print(arr[i] + " ");

				}

			}
		}

	}

}
