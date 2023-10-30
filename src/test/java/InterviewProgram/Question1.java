package InterviewProgram;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Question1 {

	public static void main(String[] args) {
		int[] arr = { 1, 345, 54, 45 };
		String [] a = {"a", "b", "c", "d"};
 		String s = Arrays.asList(1, 34, 3215, 56, 55).stream().map(i -> String.valueOf(i))
				.collect(Collectors.joining(";"));
System.out.println(s);
	String join1 = Arrays.asList(a).stream().collect(Collectors.joining("|"));
	System.out.println(join1);
	String join = String.join("|", a);
	System.out.println(join);
	}

}
