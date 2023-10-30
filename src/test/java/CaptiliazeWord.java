
public class CaptiliazeWord {
	
	public String CapitalizeWord(String s ) {
		if(s.length()==1) {
			return s.toUpperCase();
		}
		
		String [] arr = s.split("\\s");
		String result = "";
		for(String s1 : arr) {
			String firstLetter = s1.substring(0, 1).toUpperCase();
			String restString = s1.substring(1);
			result = result + firstLetter + restString + "";
		}
		return result;
	}

	public static void main(String[] args) {
		CaptiliazeWord word = new CaptiliazeWord();
		word.CapitalizeWord("test ayro");
		System.out.println(word.CapitalizeWord("test ayro"));
	}

}
