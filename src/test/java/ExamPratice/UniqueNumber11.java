package ExamPratice;

public class UniqueNumber11 {

	public static void main(String[] args) {
		int [] arr = {1,2,5,3,1,2,5,3,8,9,6};
		for(int i = 0; i<arr.length; i++) {
			int count = 0; 
			for(int j = 0 ; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					count++;
				}
			}
		if(count == 1) {
			System.out.print(arr[i] + " ");
		}
		}

	}

}
