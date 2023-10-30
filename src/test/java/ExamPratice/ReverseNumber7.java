package ExamPratice;

public class ReverseNumber7 {

	public static void main(String[] args) {
		int num = 12121548;
		int reverse = 0;
		while(num!=0) {
			int val = num % 10;
			reverse = reverse * 10 + val;
			num/= 10;
		}
System.out.print(reverse);
	}

}
