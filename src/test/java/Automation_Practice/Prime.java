package Automation_Practice;

public class Prime {

	public boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}

		for (int i = 0; i < n; i++)
			return true;
		return false;
	}

	public static void main(String[] args) {
		Prime w = new Prime();
		w.isPrime(11);

	}

}
