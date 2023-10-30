package Practice03042023;

public class CaptilizedWord {

	public static String capitalized(String s) {
		String [] s3 = s.split("\\s");
		String result = "";
		for(String s2 :s3) {
			String fName = s2.substring(0,1).toUpperCase();
			String lName = s2.substring(1);
			result = result + fName + lName + " ";
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(capitalized("automation testing"));
	}

}
