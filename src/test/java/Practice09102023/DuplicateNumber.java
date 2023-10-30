package Practice09102023;

public class DuplicateNumber {

	public static void main(String[] args) {
	int [] arr = {1,2,6,9,8,2,8,1,4};
	for(int i = 0;i<arr.length; i++) {
		for(int j = i+1; j<arr.length; j++) {
			if(arr[i] == arr[j]) {
				System.out.print(arr[i] + " ");
				
			}
		}

	}

	}

}
