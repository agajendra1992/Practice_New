package ExamPratice;

public class ReverseNumber2 {

	public static void main(String[] args) {
		int number = 1542322481;
		int reverse = 0;
		while (number != 0) {
			int val = number % 10;
			reverse = reverse * 10 + val;
			number /= 10;
		}
System.out.println("ReverseNumber::"+ reverse);
	}

}
