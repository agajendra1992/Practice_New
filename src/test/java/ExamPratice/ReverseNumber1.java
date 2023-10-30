package ExamPratice;

public class ReverseNumber1 {

	public static void main(String[] args) {
	  int number = 12523648;
	  int reverse = 0;
    System.out.println("WithOut Reverse::"+number);	  
	  while(number != 0){
		int val = number % 10 ;
		reverse = reverse * 10 + val;
		number /= 10;
	  }

	  System.out.println("Reverse::"+ reverse);
	}

}
