package InterviewProgram;

public class Question222222 {

	public static String getCapitilizedWord(String s) {
		String[] s2 = s.split("\\s");
		String result = "";
		for (String s3 : s2) {
			String firstName = s3.substring(0, 1).toUpperCase();
			String lasterName = s3.substring(1);
			result = result + firstName + lasterName + " ";
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.print(getCapitilizedWord("automation testing session"));

	}

}
