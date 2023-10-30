package PracticeExample04042023;

public class CaptilizedWord {

	public static String capitalWord(String s) {
		String[] arr = s.split("\\s");
		String result = "";
		for (String s2 : arr) {
			String fName = s2.substring(0, 1).toUpperCase();
			String lName = s2.substring(1);
			result = result + fName + lName + " ";
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(capitalWord("automation testing"));
	}

}
