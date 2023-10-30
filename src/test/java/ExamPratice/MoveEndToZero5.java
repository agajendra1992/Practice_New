package ExamPratice;

public class MoveEndToZero5 {

	public static void main(String[] args) {
		int[] arr = { 1, 0, 5, 3, 4, 0, 2, 6, 8, 9 };
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[count++] = arr[i];
			}
		}
		while (count < arr.length) {
			arr[count++] = 0;
		}
		
		for(int j = 0; j<arr.length; j++) {
			System.out.print(arr[j] + " ");
		}

	}

}
