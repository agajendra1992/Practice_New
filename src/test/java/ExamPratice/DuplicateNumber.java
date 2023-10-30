package ExamPratice;

public class DuplicateNumber {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 31, 2, 1, 2, 5, 6 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}

	}

}
