package ExamPratice;

public class Asc4 {

	public static void main(String[] args) {

		int[] ar = { 22, 55, 3, 2, 55, 77, 21, 23 };
		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] > ar[j]) {
					int temp = 0;
					temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
			System.out.println(ar[i]);
		}

	}

}