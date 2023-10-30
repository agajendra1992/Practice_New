	package ExamPratice;
	
	public class DuplicateNumber3 {
	
		public static void main(String[] args) {
			int[] arr = { 12, 22, 22, 12, 44, 21, 10 };
	
			for (int i = 0; i < arr.length; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] == arr[j]) {
						System.out.println(arr[i]);
					}
				}
			}
	
		}
	
	}
