package PatternExample16032023;

public class AlphabetPatter {
	static int alpha = 65;

	public static void main(String[] args) {
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char) (alpha + j) + " ");
			}
			System.out.println();
		}

	}

}
