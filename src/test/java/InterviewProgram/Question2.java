package InterviewProgram;

public class Question2 {

	public static String captilizeWord(String s) {
		if (s.length() == 1) {
			return s.toUpperCase();
		}
		String[] sarr = s.split("\\s");

		String result = "";
		for (String w : sarr) {
			String firstLetter = w.substring(0, 1).toUpperCase();// A;
			String restStrig = w.substring(1);
			result = result + firstLetter + restStrig + " ";
		}
		return result;
	}

	public static void main(String[] args) {
		String sdsf = captilizeWord("naveen automation");
		System.out.println(sdsf);
		System.out.println(captilizeWord("akash auomation labs"));
		System.out.println(captilizeWord("gajendra"));
		System.out.println(captilizeWord("1233 test akash automation"));
	}

}
