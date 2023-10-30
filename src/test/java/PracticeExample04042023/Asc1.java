package PracticeExample04042023;

public class Asc1 {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 21, 31, 14, 1, 3, 2 };
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {

				if (arr[i] > arr[j]) {
					int temp = 0;
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}
			System.out.print(arr[i] + ",");
		}

	}
}
