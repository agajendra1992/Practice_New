package ExamPratice;

public class UniqueNumber5 {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 2, 1, 4, 2, 5 };
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println("Print Unique Number :: " + arr[i]);
				;
			}
		}

	}

}
