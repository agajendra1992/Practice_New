package ExamPratice;

public class Asc2 {

	public static void main(String[] args) {
		int[] arr = { 23, 332, 1, 3, 26, 44, 90 };
		int temp = 0;
		for(int i = 0; i<arr.length; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i]> arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		System.out.println(arr[i]);
		}

	}

}
