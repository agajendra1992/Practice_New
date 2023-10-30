package TestingAnnotation;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamTest {
	
	@Test
	@Parameters("val1")
	public void test(String param) {
		System.out.println("Param Value is "+ param);
	}

}
