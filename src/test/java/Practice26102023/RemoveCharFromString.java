/**
 * 
 */
package Practice26102023;

/**
 * @author user
 *
 */
public class RemoveCharFromString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1 = "Today is great day";
		String s2 = "To";
		for(int i = 0; i<s1.length(); i++) {
			for(int j = 0; j<s2.length(); j++) {
				if(s1.charAt(i) == s2.charAt(j)) {
					s1 = s1.substring(0, i) + s1.substring(i+ 1);
				}
			}
			
		}
		System.out.println(s1);
	}

}
