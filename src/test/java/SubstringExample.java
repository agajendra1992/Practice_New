
public class SubstringExample {

	public static void validateStringMiddleName(String s, String s1) {
		String[] subString = s.split("\\.");
		String[] subString1 = s1.split("\\.");
		System.out.println(subString.length);
		System.out.println(subString1.length);
		if (subString.length > subString1.length) {
         for(String ss :subString) {
			System.out.print(ss+".");
		}}
		else {
			System.out.println(subString.toString());
		}
	}

	public static void main(String[] args) {
		String s1 = "gajendra.saxena@wipro.com";
		String s2 = "rohith.kumar.singh@openbet.com";
		SubstringExample.validateStringMiddleName(s2, s1);
	}

}
