package TestingAnnotation;

import org.testng.annotations.Test;

public class DependOnMethods {

	@Test
	public void t1() {
		System.out.println("Test is Not Dependent");
	}
	
	@Test(dependsOnMethods = "t1")
	public void t2() {
		System.out.println("Test is Dependent");
	}
	
	@Test
	public void t3() {
		System.out.println("Test3 is Not Dependent");
	}
	
	@Test(dependsOnMethods = "t3")
	public void t4() {
		System.out.println("Test2 is Dependent");
	}
	
	
}
