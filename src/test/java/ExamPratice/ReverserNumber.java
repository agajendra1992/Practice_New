package ExamPratice;

public class ReverserNumber {

	public static void main(String[] args) {
		int number = 12345666;
		int reverse = 0;
		while(number != 0) {
			int val = number % 10 ;
			reverse = reverse * 10 + val;
			number /= 10;
		}
System.out.println("Reverse Number is ::"+reverse);
	}

}
