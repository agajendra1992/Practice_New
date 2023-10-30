package ExamPratice;

public class DuplicateNumber1 {

	public static void main(String[] args) {
		int [] arr = {2,4,45,5,4,6,7,9,2};
		
		for(int i= 0; i<arr.length; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}

	}

}
