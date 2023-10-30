package TestingAnnotation;

import org.junit.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAll1 {
	@BeforeSuite
	public void m1() {
		System.out.println("M1");
	}
	@BeforeTest
	public void m2() {
		System.out.println("M2");
	}
	@BeforeClass
	public void m3() {
		System.out.println("M3");
	}
	@BeforeMethod
	public void m4() {
		System.out.println("M4");
	}
	@Test
	public void m5() {
		System.out.println("M5");
	}
	@AfterSuite
	public void m6() {
		System.out.println("M6");
	}
	@AfterTest
	public void m7() {
		System.out.println("M7");
	}
	@AfterClass
	public void m8() {
		System.out.println("M8");
	}
	@AfterMethod
	public void m9() {
		System.out.println("M9");
	}

}
