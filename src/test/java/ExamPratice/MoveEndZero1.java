package ExamPratice;

public class MoveEndZero1 {

	public static void main(String[] args) {
		int p[] = { 1, 0, 9, 3, 0, 8 };
		int count = 0;

		for (int i = 0; i < p.length; i++) {
			if (p[i] != 0) {
				p[count++] = p[i];

			}
		}

		while (count < p.length) {
			p[count++] = 0;
		}
		
		for(int j = 0; j<p.length; j++) {
			System.out.print(p[j] + " ");
		}

	}

}
