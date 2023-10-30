package InterviewProgram;

public class Question222 {

	public static String captilizeWord(String s) {
		String ss [] = s.split("\\s");
		String result = "";
		for(String s1 : ss) {
			String firstName = s1.substring(0,1).toUpperCase();
			String  lastName = s1.substring(0);
			result = result + firstName + lastName + " ";
		}
		return result;
	}
	
	public static void main(String[] args) {
	System.out.println(captilizeWord("test automation"));

	}

}
