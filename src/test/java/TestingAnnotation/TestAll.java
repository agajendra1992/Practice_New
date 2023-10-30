package TestingAnnotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAll {
	@BeforeSuite
	public void t1() {
		System.out.println("Before Suite");
	}

	@BeforeTest
	public void t2() {
		System.out.println("Before Test");
	}

	@BeforeClass
	public void t3() {
		System.out.println("Before Class");
	}

	@BeforeMethod
	public void t4() {
		System.out.println("Before Method");
	}

	@Test
	public void t5() {
		System.out.println("Test Annotation");
	}

	@AfterMethod
	public void t6() {
		System.out.println("After Method");
	}

	@AfterClass
	public void t7() {
		System.out.println("After Class");
	}

	@AfterTest
	public void t8() {
		System.out.println("After Test");
	}

	@AfterSuite
	public void t9() {
		System.out.println("After Suite");
	}

}
