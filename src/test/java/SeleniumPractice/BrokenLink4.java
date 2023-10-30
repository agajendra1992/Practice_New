package SeleniumPractice;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BrokenLink4 extends Launch {

	@Test
	public void verifyBrokenLink() throws IOException, InterruptedException {
//		launchApp();
		Thread.sleep(2000);
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for (int i = 0; i < links.size(); i++) {
			String url = links.get(i).getAttribute("href");
			URL urlValue = new URL(url);
			HttpsURLConnection connection = (HttpsURLConnection) urlValue.openConnection();
			connection.connect();

			int responseCode = connection.getResponseCode();
			Assert.assertEquals(responseCode, 200);

		}
		driver.quit();
	}

}
