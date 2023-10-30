package ExamPratice;

public class Desc9 {

	public static void main(String[] args) {
		int[] arr = { 45, 44, 12, 77, 89, 23, 23 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = 0;
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
			System.out.print(arr[i] + " ");
		}

	}

}
