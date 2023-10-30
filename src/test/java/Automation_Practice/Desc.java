package Automation_Practice;

public class Desc {

	public static void main(String[] args) {
		int[] arr = { 2, 0, 3, 6, 9, 0, 55, 3 };
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[count++] = arr[i];
			}
		}
		while (count < arr.length) {
			arr[count++] = 0;
		}
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");
		}
	}

}
