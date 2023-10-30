package ExamPratice;

public class ReverseNumber3 {

	public static void main(String[] args) {
		int number = 12523648;
		int reverse = 0;
		  while(number != 0){
				int val = number % 10 ;
				reverse = reverse * 10 + val;
				number /= 10;
			  }
		System.out.print(reverse + " ");

	}

}
