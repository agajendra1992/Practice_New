package Automation_Practice;

public class ReverseNumber {

	public static void main(String[] args) {
		int number = 144589;
		int reverse = 0;
		
		while(number!= 0) {
			int val = number % 10;
			reverse = reverse * 10 + val;
			number /=10;
		}
	System.out.print(reverse + " ");

	}

}
