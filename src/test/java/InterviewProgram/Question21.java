package InterviewProgram;

public class Question21 {

	public static void getCaptilizedWord(String s) {
		String [] ss = s.split("\\s");
		String result = "";
		for(String s2 : ss) {
			String fName = s2.substring(0, 1).toUpperCase();
			String lName = s2.substring(1);
			result = result + fName + lName + " ";
		}
		System.out.println(result);
	}
	public static void main(String[] args) {
		getCaptilizedWord("test automation application");

	}

}
