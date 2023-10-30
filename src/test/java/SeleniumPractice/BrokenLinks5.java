package SeleniumPractice;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BrokenLinks5 extends Launch {

	@Test
	public void verify_BrokenLink() throws IOException {
	//	launchApp();
		List<WebElement> list = driver.findElements(By.tagName("a"));
		for (int i = 0; i < list.size(); i++) {
			String value = list.get(i).getAttribute("href");
			URL url = new URL(value);
			
			HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
			connection.connect();
			 int code = connection.getResponseCode();
			 if(code == 200) {
				 System.out.println(value+" Link resposne code "+ code);
			 }else {
				 System.out.println(value+" Link resposne code ");
			 }
		}

	}
}
