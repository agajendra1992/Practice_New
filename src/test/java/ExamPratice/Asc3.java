package ExamPratice;

public class Asc3 {

	public static void main(String[] args) {

		int[] arr = { 26, 11, 58, 89, 25, 69, 44, 56, 12, 14, 45 };

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
