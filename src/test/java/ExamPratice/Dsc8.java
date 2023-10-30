package ExamPratice;

public class Dsc8 {

	public static void main(String[] args) {
		int[] arr = { 131, 12, 133, 15, 233, 9 };
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
