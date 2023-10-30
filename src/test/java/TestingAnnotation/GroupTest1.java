package TestingAnnotation;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GroupTest1 {

	@Test(groups = "Sanity")
	@Parameters("Browser")
	public void group1(String value) {
		System.out.println("Group 1 for "+ value);
	}
	
	@Test(dependsOnGroups = "Regression")
	@Parameters("Browser")
	public void group2(String value) {
		System.out.println("Group 2 for "+ value);
	}
}
