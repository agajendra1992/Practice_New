package Automation_Practice;

public class Asc {

	public static void main(String[] args) {
		int[] arr = { 1, 25, 8, 97, 26, 9, 14, 3, 4, 9 };
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
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
