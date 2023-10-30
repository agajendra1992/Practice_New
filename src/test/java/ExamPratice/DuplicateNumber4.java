package ExamPratice;

public class DuplicateNumber4 {

	public static void main(String[] args) {
		int[] arr = { 22, 3, 2, 11, 22, 44, 89 };
		for(int i = 0; i<arr.length; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i]== arr[j]) {
					System.out.println("Duplicate Number is ::"+ arr[i]);
				}
			}
		}

	}

}
