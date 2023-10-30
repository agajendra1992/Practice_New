package ExamPratice;

public class Desc4 {

	public static void main(String[] args) {
		int[] arr = { 112, 25, 9, 28, 12, 44, 589, 256, 8114, 145, 10 };
		
		for(int i =0; i<arr.length; i++) {
			for(int j = i+1 ; j<arr.length; j++) {
				int temp =0;
				if(arr[i]< arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
	System.out.println(arr[i]);
		}

	}

}
