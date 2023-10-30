package ExamPratice;

public class Asc5 {

	public static void main(String[] args) {
		int[] a = { 125, 4, 47, 89, 15, 10 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] > a[j]) {
					int temp = 0;
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}
			System.out.print(a[i] + ",");
		}
	}

}
