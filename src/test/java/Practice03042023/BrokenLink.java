package Practice03042023;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import SeleniumPractice.Launch;

public class BrokenLink extends Launch {
	@Test
	public void verify_Brokenlink() throws IOException {
		//launchApp();
		List<WebElement> ele = driver.findElements(By.tagName("a"));
		for(int i = 0; i<ele.size(); i++) {
			String url = ele.get(i).getAttribute("href");
			URL value = new URL(url);
			HttpsURLConnection httpUrlConnection = (HttpsURLConnection) value.openConnection();
			httpUrlConnection.connect();
			int code = httpUrlConnection.getResponseCode();
			if(code == 200) {
				System.out.println("Response Code is "+ code + "for url :: " +url);
			}
			
		}
	}



}
