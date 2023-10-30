package PatternExample16032023;

public class AlphaOrder {
	static int ap = 97;

	public static void main(String[] args) {

		for (int i = 0; i <= 25; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char)ap + " ");
			}
			ap++;
			System.out.println();
				}
		
	}

}
