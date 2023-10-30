package ExamPratice;

public class ReverserNumber3 {

	public static void main(String[] args) {
		int number = 154545858;
		int reverse = 0;

		while (number != 0) {
			int val = number % 10;
			reverse = reverse * 10 + val;
			number /= 10;
		}
		System.out.print(reverse);
	}

}
