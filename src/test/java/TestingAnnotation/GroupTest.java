package TestingAnnotation;

import org.testng.annotations.Test;

public class GroupTest {

	@Test(groups = "UI Group")
	public void groupTest1() {
		System.out.println("Test the Group 1");
	}

	@Test(groups = { "API Group", "UI Group" })
	public void groupTest2() {
		System.out.println("Test the Group 2");
	}

	@Test(groups = "API Group")
	public void groupTest3() {
		System.out.println("Test the Group 3");
	}

}
