package PatternExample16032023;

public class AlphaBet2 {
	static int alpha = 97;

	public static void main(String[] args) {
		for (int i = 0; i <= 25; i++) {
			for (int j = 25; j >= i; j--) {
				System.out.print("");
			}
			for(int k =0; k<=i; k++) {
				System.out.print((char) (alpha+k)+ "" );
			}
			System.out.println();
		}

	}

}
