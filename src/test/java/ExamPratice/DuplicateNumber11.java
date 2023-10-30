package ExamPratice;

public class DuplicateNumber11 {

	public static void main(String[] args) {
		int[] arr = { 2, 5, 6, 5, 2, 8 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					System.out.print(arr[j] + " ");
				}

			}
		}
	}

}
