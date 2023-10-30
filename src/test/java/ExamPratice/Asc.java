package ExamPratice;

public class Asc {

	public static void main(String[] args) {
		int[] arr = { 33, 22, 45, 89, 43, 20, 3, 2 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = 0;
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.print(arr[i]+",");
		}

	}

}
