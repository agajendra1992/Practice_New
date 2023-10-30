package ExamPratice;

public class ReverseNumber5 {

	public static void main(String[] args) {
	int num =154588978;
	int reverse =0;
	while(num!= 0) {
		int val = num % 10;
		reverse = reverse * 10 + val;
		num /=10;
	}
System.out.println(reverse);
	}

}
