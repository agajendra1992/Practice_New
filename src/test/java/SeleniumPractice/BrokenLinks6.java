package SeleniumPractice;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BrokenLinks6 extends Launch {

	
	@Test
	public void verifyBrokenLink() throws IOException {
//		launchApp();
		List<WebElement> urlList = driver.findElements(By.tagName("a"));
		for(int i = 0; i < urlList.size(); i++) {
			String s = urlList.get(i).getAttribute("href");
			URL urlValue = new URL(s);
			HttpsURLConnection connection = (HttpsURLConnection) urlValue.openConnection();
			connection.connect();
			int response = connection.getResponseCode();
			if(response == 200) {
				System.out.println("Responce code is :::"+ response);
			}
		}
	}
}
