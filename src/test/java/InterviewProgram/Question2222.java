package InterviewProgram;

public class Question2222 {

	
	public static String capitilizedWord(String s) {
		String [] s1 = s.split("\\s");
		String result = "";
		
		for (String s2 : s1) {
		String firtName = s2.substring(0,1).toUpperCase();
		String lastName = s2.substring(1);
		result = result + firtName + lastName + " ";
		}		
		return result;
	}
	public static void main(String[] args) {
		System.out.println(capitilizedWord("automation testing"));

	}

}
