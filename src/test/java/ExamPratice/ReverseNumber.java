package ExamPratice;

public class ReverseNumber {

	public static void main(String[] args) {
		int reverse = 0;
		int number = 14572539;

		while (number != 0) {
			int val = number % 10;
			reverse = reverse * 10 + val;
			number /= 10;
		}
		System.out.print(reverse);
	}

}
