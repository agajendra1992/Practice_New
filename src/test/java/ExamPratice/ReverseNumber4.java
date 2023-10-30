package ExamPratice;

public class ReverseNumber4 {

	public static void main(String[] args) {
		int num = 154545447;
		int reverse = 0;
		while (num != 0) {
			int val = num % 10;
			reverse = reverse * 10 + val;
			num /= 10;

		}
		System.out.println(reverse);
	}

}
