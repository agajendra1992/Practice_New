package SeleniumPractice;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BrokenLink8 extends Launch {

	@Test
	public void verify_link() throws IOException {
		//launchApp();
		List<WebElement> ele = driver.findElements(By.tagName("a")); 
		for(int i =0; i<ele.size(); i++) {
			String url = ele.get(i).getAttribute("href");
			URL urlValue = new URL(url);
			HttpsURLConnection connection = (HttpsURLConnection) urlValue.openConnection();
			connection.connect();
			int responseCode = connection.getResponseCode();
			if(responseCode == 200) {
			System.out.println(responseCode);
			}
			
		}
	}
}
