package TestingAnnotation;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test3 {
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BeforeMethod");
	}
	
	@Test
	public void test2() {
		System.out.println("Test 1");
	}
	
	@Test
	public void test3() {
		System.out.println("Test 2");
	}
	
	@Test
	public void test4() {
		System.out.println("Test 3");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}

}
