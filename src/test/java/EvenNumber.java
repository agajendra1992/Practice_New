import java.util.ArrayList;
import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		Scanner scann = new Scanner(System.in);
		int s = scann.nextInt();

		for (int i = 0; i <= s; i++) {
			if (i % 2 == 0) {
				arr.add(i);
				
			}
		}
		System.out.println(arr);

	}

}
