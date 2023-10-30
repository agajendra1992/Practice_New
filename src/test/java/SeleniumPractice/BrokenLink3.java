package SeleniumPractice;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BrokenLink3 extends Launch {

	@Test
	public void linkVerify() throws IOException, InterruptedException {
//		launchApp();
		Thread.sleep(3000);
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for (int i = 0; i < links.size(); i++) {
			String url = links.get(i).getAttribute("href");
			URL urlValue = new URL(url);
			HttpsURLConnection connection = (HttpsURLConnection) urlValue.openConnection();
			connection.connect();
			int responseCode = connection.getResponseCode();
			if (responseCode == 200) {
				System.out.println("Url " + url + "  response code is " + responseCode);
			}
		}
		driver.quit();
	}
}
