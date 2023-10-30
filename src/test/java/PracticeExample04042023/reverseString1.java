package PracticeExample04042023;

public class reverseString1 {

	public static void main(String[] args) {
		String s = "AutomationTest";
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
	}
}