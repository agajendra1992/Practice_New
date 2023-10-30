package ExamPratice;

public class Asc1 {

	public static void main(String[] args) {
		int[] arr = { 3, 4, 5, 6, 0, 12, 32, 32, 12, 44, 2, 1 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = 0;
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
			System.out.println(arr[i]);
		}

	}

}
