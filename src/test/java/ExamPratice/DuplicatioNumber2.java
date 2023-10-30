package ExamPratice;

public class DuplicatioNumber2 {

	public static void main(String[] args) {
		int[] arr = { 1, 33, 2, 3, 2, 4, 1, 5, 6, 9 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}

	}

}
