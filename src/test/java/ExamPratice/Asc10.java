package ExamPratice;

public class Asc10 {

	public static void main(String[] args) {
		int[] arr = { 2, 22, 1, 3, 53, 2 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = 0;
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.print(arr[i]+ " ");
		}

	}

}
