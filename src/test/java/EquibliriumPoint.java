
public class EquibliriumPoint {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 1, 3, 2, 0, 5 };
		int n = a.length;
		int sum = 0;
		int leftSum = 0;
		int rightSum = 0;

		for (int i = 0; i < n; i++) {
			sum = sum + a[i];
		}
		rightSum = sum;
		for (int i = 0; i < n; i++) {
			rightSum = rightSum - a[i];
			if (leftSum == rightSum) {
				System.out.println("Index is " + i);
			}
			leftSum = leftSum + a[i];
		}

	}

}
