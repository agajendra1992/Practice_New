package InterviewProgram;

public class Question22222 {

	public static void capitilizedWord(String n) {
		String[] arr = n.split("\\s");
		String result = "";

		for (String s1 : arr) {
			String fName = s1.substring(0, 1).toUpperCase();
			String lName = s1.substring(1);
			result = result + fName + lName + " ";
		}
		System.out.println(result);
	}

	public static void main(String[] args) {
		Question22222.capitilizedWord("testing application");
	}

}
