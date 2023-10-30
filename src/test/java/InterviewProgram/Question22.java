package InterviewProgram;

public class Question22 {

	public static void capitalizedWord(String s) {
		String[] arr = s.split("\\s");
		String result = "";
		for (String s1 : arr) {
			String first = s1.substring(0, 1).toUpperCase();
			String last = s1.substring(1);
			result = result + first + last + " ";
		}
		System.out.println(result);

	}

	public static void main(String[] args) {
		capitalizedWord("automation selenium application");
		capitalizedWord("automation testing ");
	}

}
