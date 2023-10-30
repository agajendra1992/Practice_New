package PracticeExample04042023;

public class UniqueNumber2 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 6, 8, 5, 1, 2 };
		System.out.print("Unique Number is ");
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count == 1) {
				System.out.print(arr[i] + ",");
			}
		}

	}

}
