package TestingAnnotation;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Test2 {
	@AfterSuite
	public void test() {
		System.out.println("Test e");
	}

	@AfterTest
	public void test1() {
		System.out.println("Test f");
	}

	@Test
	public void test2() {
		System.out.println("Test g");
	}

	@Test
	public void test3() {
		System.out.println("Test h");
	}
}
