package ExamPratice;

public class ReverseString4 {
	public static void main(String[] args) {
		String s = "seleniumAutomation";
		for(int i = s.length()-1; i>=0; i--) {
			System.out.print(s.charAt(i));
		}
	}
}
