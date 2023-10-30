package Practice03042023;

public class DuplicateNumber1 {

	public static void main(String[] args) {
		int [] arr = {2,5,6,2,5,9,2,1,8,7,5,4};
		for(int i = 0; i<arr.length; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i]== arr[j]) {
					System.out.print(arr[i]+ ",");
				}
			}
		}

	}

}
