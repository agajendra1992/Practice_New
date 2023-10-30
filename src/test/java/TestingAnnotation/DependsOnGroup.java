package TestingAnnotation;

import org.testng.annotations.Test;

public class DependsOnGroup {

	@Test(groups = {"UI Group"})
	public void test1() {
		System.out.println("Method Not depends On Group");
	}
	
	@Test(groups = {"UI Group"})
	public void test2() {
		System.out.println("Test2 Method depends On Group Test1");
	}
	
	@Test(dependsOnGroups = {"UI Group"})
	public void test3() {
		System.out.println("Test3 Method depends On Group Test2");
	}

}
