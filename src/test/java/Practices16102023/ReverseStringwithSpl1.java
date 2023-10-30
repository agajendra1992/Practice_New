package Practices16102023;

public class ReverseStringwithSpl1 {

	public static void reverse(char[] ch) {
		int i = 0;
		int j = ch.length - 1;

		while (i < j) {
			if (!Character.isAlphabetic(ch[i])) {
				i++;
			} else if (!Character.isAlphabetic(ch[j])) {
				j--;
			} else {
				char temp = ch[i];
				ch[i] = ch[j];
				ch[j] = temp;
				i++;
				j--;
			}
		}
	}

	public static void main(String[] args) {
		String s = "ab#bsTest@";
		char[] ch = s.toCharArray();
		ReverseStringwithSpl1.reverse(ch);
		System.out.println(new String(ch));

	}

}
