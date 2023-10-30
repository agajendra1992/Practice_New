package PracticeExample04042023;

public class Dsc {

	public static void main(String[] args) {
		int arr[] = { 13, 2, 5, 1, 90, 3, 1, 3 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int tem = 0;
					tem = arr[i];
					arr[i] = arr[j];
					arr[j] = tem;
				}
			}
		System.out.print(arr[i]+ " ");
		}

	}

}
