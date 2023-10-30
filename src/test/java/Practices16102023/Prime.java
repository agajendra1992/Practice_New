/**
 * 
 */
package Practices16102023;

/**
 * @author user
 *
 */
public class Prime {

	/**
	 * @param args
	 */
	
	public static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		for(int i = 2 ;i<Math.sqrt(n); i++) {
			if(n % 2==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
System.out.println(Prime.isPrime(22));

	}

}
