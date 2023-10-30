package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/main/java/features", glue = {
		"stepDefinitions" }, monochrome = true, tags = "", plugin = { "pretty", "html:build/reports/cucumber",
				"json:build/reports/cucumber-tests/test.json" })

public class TestRunner extends AbstractTestNGCucumberTests {
	
	
	public void testExecute() {
		
	}

}
