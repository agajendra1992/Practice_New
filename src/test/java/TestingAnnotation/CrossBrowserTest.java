package TestingAnnotation;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest {
	
	@Test
	@Parameters("Browser")
	public void test(String param) {
		System.out.println("Thread is::: "+ Thread.currentThread().getId());
		System.out.println("Test the application with "+ param);
		
	}

}
