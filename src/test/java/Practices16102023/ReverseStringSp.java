package Practices16102023;

public class ReverseStringSp {

	public static void reverse(char[] ch) {
		int i = 0;
		int j = ch.length - 1;

		while (i < j) {
			if (!Character.isAlphabetic(ch[i])) {
				i++;
			} else if (!Character.isAlphabetic(ch[j])) {
				j--;
			} else {
				char tem = ch[i];
				ch[i] = ch[j];
				ch[j] = tem;
				i++;
				j--;
			}
		}
	}

	public static void main(String[] args) {
		String s = "ab$test$check";
        char [] ch= s.toCharArray();
        reverse(ch);
		String reverseValue = new String(ch);
		System.out.println(reverseValue);
	}

}
