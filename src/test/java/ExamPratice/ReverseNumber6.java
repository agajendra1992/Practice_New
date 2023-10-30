package ExamPratice;

public class ReverseNumber6 {

	public static void main(String[] args) {
		int reverse = 0;
		int num = 1248494;

		while (num != 0) {
			int val = num % 10;
			reverse = reverse * 10 + val;
			num /= 10;

		}
		System.out.println(reverse);
	}

}
