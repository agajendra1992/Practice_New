package Practice09102023;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import SeleniumPractice.Launch;

public class ShadowRoot extends Launch{

	public static void main(String[] args) {
		Launch launch = new Launch();
		//launch.launchApp();
		driver.navigate().to("chrome://downloads/");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement bar = (WebElement) jse.executeScript(
				"return document.querySelector('downloads-manager').shadowRoot.querySelector('downloads-toolbar#toolbar').shadowRoot.querySelector('cr-toolbar').shadowRoot.querySelector('cr-toolbar-search-field#search').shadowRoot.querySelector('div#searchTerm > input#searchInput')");
		String s = "arguments[0].setAttribute('value', 'Automationtest')";
          jse.executeScript(s, bar);
	}

}
