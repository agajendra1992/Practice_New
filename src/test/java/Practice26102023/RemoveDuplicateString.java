/**
 * 
 */
package Practice26102023;

/**
 * @author user
 *
 */
public class RemoveDuplicateString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s= "Hello world1 Hello world2";
	
		String [] s1 = s.split("");
		for(int i =0; i<s1.length; i++) {
			int count = 1;
			for(int j = i+1; j<s1.length; j++) {
				if(s1[i].equals(s1[j])) {
					count++;
				}
			}
			if(count>1 && s1[i]!="0") {
				System.out.print(s1[i]);
			}
		}

	}

}
