package Practices16102023;

public class ReverseStringSpecial {
	    public static void main(String[] args) {
	       //reverseString("T@E$J#A%S");
	    	String s ="ab$test$check"; 
	       reverseString(s.toCharArray());
	       
	}

	//S@A$JE@T
	private static void reverseString(char[] charArray){
		   int j = charArray.length-1;
	        int k = 0;
	        for(int i = charArray.length-1; i>=0;  i--) {
	            if(!(charArray[i] >= 65 && charArray[i] <=90) || !(charArray[i] >= 97 && charArray[i] <=122)) {
	                charArray[j] = charArray[i];
	                System.out.print(charArray[j]);
	                j--;
	                
	            }
	            else {
	                charArray[k] = charArray[i];
	                System.out.print(charArray[k]);
	                k++;
	            }       
	        }   
	}

}
