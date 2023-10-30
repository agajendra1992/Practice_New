package ExamPratice;

public class ReverseString8 {
	public static void main(String[] args) {

		String s= "automatiotest";
		for(int i = s.length()-1; i>=0; i--) {
			System.out.print(s.charAt(i));
		}
	}
}
