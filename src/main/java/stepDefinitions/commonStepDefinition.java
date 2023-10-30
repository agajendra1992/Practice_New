package stepDefinitions;

import io.cucumber.java8.En;

public class commonStepDefinition implements En {

	public commonStepDefinition() {
		Given("I want to write a step with precondition", () -> {
			System.out.println("Test");
		});

		Given("some other precondition", () -> {
			System.out.println("Test 2 Steps");
		});

		When("I complete action", () -> {
			System.out.println("Test 3 Steps");
		});

		And("some other action", () -> {
			System.out.println("Test 4 Steps");
		});

		Then("yet another action", () -> {
			System.out.println("Test 5 Steps");
		});

		And("I validate the outcomes", () -> {
			System.out.println("Test 6 Steps");
		});

		And("check more outcomes", () -> {
			System.out.println("Test 7 Steps");
		});
	}
}
