package Practice09102023;

public class ReverseString {

	public static void main(String[] args) {
		String s= "seleniumAutomate";
		System.out.print("Reverse String:: ");
		for(int i = s.length()-1; i>=0; i--) {
			System.out.print(s.charAt(i));
		}


	}

}
