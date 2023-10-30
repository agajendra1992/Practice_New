package TestingAnnotation;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import SeleniumPractice.Launch;

public class CrossBrowserTest1 extends Launch {

	@Test
	@Parameters("Browser")
	public void crossBrow(String browser) {
		//launchApp();
		System.out.println("Browser is ::" + browser);
		System.out.println("Thread is ::" + Thread.currentThread().getId());
	}
}
