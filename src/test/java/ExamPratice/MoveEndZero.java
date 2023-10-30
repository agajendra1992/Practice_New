package ExamPratice;

public class MoveEndZero {

	public static void main(String[] args) {
		int[] arr = { 1, 34, 23, 0, 1, 34, 1, 0 };
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[count++] = arr[i];
			}
		}
		
		while(count <arr.length) {
			arr[count++] = 0;
		}
		for(int j = 0;j<arr.length; j++) {
			System.out.print(arr[j]+ " ");
		}

	}

}
