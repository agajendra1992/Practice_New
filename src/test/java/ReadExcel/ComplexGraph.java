package ReadExcel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import SeleniumPractice.Launch;

public class ComplexGraph extends Launch {

	public static void main(String[] args) throws InterruptedException {
		Launch launch = new Launch();
		//launch.launchApp();
		driver.navigate().to("https://emicalculator.net/");
		Thread.sleep(5000);
		String verticalXpath = "//*[local-name()='svg']//*[name()='g' and@class='highcharts-series-group']//*[name()='rect']";
		List<WebElement> elementList = driver.findElements(By.xpath(verticalXpath));
		String textPath = "//*[local-name()='svg']//*[name()='g' and @class='highcharts-label highcharts-tooltip highcharts-color-undefined']//*[name()='text']";
		
		System.out.println("TotalBars ::" + elementList.size());
		Actions action = new Actions(driver);
		for (WebElement e : elementList) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", e);
			action.moveToElement(e).perform();
			Thread.sleep(500);
			String text = driver.findElement(By.xpath(textPath)).getText();
			System.out.println(text);
		}
		driver.quit();
	}

}
