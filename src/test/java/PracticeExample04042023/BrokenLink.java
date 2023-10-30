package PracticeExample04042023;

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
	public void verify_Link() throws IOException {
	//	launchApp();
		List<WebElement> ele = driver.findElements(By.tagName("a"));
		for(int i = 0; i<ele.size(); i++) {
			String url = ele.get(i).getAttribute("href");
			URL val = new URL(url);
			HttpsURLConnection connection = (HttpsURLConnection) val.openConnection();
			connection.connect();
			int response = connection.getResponseCode();
			if(response== 200) {
				System.out.println("Response code is "+ response + " for Url "+ url);
			}
			connection.disconnect();
		}
	}

}
