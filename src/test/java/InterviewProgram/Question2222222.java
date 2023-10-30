package InterviewProgram;

public class Question2222222 {

	public static String captilize(String s) {
		String arr[] = s.split("\\s");
		String result = "";

		for (String s1 : arr) {
			String firstName = s1.substring(0, 1).toUpperCase();
			String lastName = s1.substring(1);
			result = result + firstName + lastName + " ";
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(captilize("test automation"));
	}

}
