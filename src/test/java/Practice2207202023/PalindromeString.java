package Practice2207202023;

public class PalindromeString {

	public static void main(String[] args) {
		String s = "radar";
		String reverseString = "";		
		int strLength = s.length();
		for(int i = (strLength-1); i>=0; --i) {
			reverseString = reverseString + s.charAt(i);
		}
		
		if(s.toLowerCase().equals(reverseString.toLowerCase())) {
			System.out.println(s +" is a palindrome");
		}
		else {
			System.out.println(s +" is not a palindrome");
		}
				

	}

}
