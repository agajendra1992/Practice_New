package ExamPratice;

public class Desc1 {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 4, 1, 23, 1, 3, 677, 0 };
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}
			System.out.println(arr[i]);
		}

	}

}
