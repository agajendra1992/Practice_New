package PatternExample16032023;

public class Alpha1 {
	static int aplha = 65;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <= 25; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char) aplha + " ");
			}
			++aplha;
			System.out.println();
		}
	}

}
