package Practice03042023;

public class CapitilizeWord {

	public static String capitilizeWord(String s) {
		String result = "";
		if (s.length() == 1) {
			return s;
		}
		String[] sd = s.split("\\s");
		for (String s1 : sd) {
			String first = s1.substring(0, 1).toUpperCase();
			String restString = s1.substring(1);

			result = result + first + restString;
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(capitilizeWord("automation test"));
	}

}
