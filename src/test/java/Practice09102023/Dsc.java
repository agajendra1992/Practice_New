package Practice09102023;

public class Dsc {

	public static void main(String[] args) {
		int[] arr = { 4, 25, 98, 2, 4, 9, 8, 10, 9 };
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
