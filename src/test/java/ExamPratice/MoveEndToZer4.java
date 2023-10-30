package ExamPratice;

public class MoveEndToZer4 {

	public static void main(String[] args) {
		int[] arr = { 2, 0, 5, 8, 0, 7, 6, 2, 9, 7, 3 };
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[count++] = arr[i];
			}
			System.out.print(arr[i] + " ");
		}

		while (count < arr.length) {
			arr[count++] = 0;
		}
		System.out.println();
		
		for(int j = 0; j<arr.length; j++) {
			System.out.print(arr[j] + " ");
			
		}
	}

}
