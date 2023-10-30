package SeleniumPractice;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BrokenLink7 extends Launch {

	@Test
	public void verifyBrokenLink() throws IOException {
		//launchApp();
		List<WebElement> ele = driver.findElements(By.tagName("a"));

		for (int i = 0; i < ele.size(); i++) {
			String value = ele.get(i).getAttribute("href");
			URL urlVal = new URL(value);
			HttpsURLConnection htturlConnection = (HttpsURLConnection) urlVal.openConnection();
			htturlConnection.connect();

			int code = htturlConnection.getResponseCode();
			if (code == 200) {
				System.out.println("Link verified and  response code is " + code + " for url " + value);
			}
			htturlConnection.disconnect();
		}
		driver.quit();
	}

}
