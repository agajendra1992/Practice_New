package ExamPratice;

public class Dsc6 {

	public static void main(String[] args) {
		int[] a = { 44, 34, 23, 2454, 4, 23, 67, 90 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				int temp = 0;
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}

			}
	System.out.print(a[i]+" ");
		}

	}

}
