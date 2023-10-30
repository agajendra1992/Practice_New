package PracticeExample04042023;

public class Asc2 {

	public static void main(String[] args) {
		int[] arr = { 11, 21, 1, 3, 1, 5, 0, 9 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp=0;
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}
			System.out.print(arr[i]+ ",");
		}

	}

}
