package TestingAnnotation;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
	@BeforeSuite
	public void test() {
		System.out.println("Test a");
	}

	@Test(enabled = false)
	public void test1() {
		System.out.println("Test b");
	}

	@BeforeTest
	public void test2() {
		System.out.println("Test c");
	}

	@Test
	public void test3() {
		System.out.println("Test d");
	}

}
