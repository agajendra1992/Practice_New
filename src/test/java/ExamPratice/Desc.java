package ExamPratice;

public class Desc {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 4, 2, 34, 55, 50, 99 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[i]< arr[j]) {
					int temp =0;
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		System.out.println(arr[i]);
		}

	}

}
