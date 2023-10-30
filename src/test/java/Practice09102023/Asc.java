package Practice09102023;

public class Asc {

	public static void main(String[] args) {
		int[] arr = { 25, 2, 5, 9, 6, 8, 10, 1 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
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
