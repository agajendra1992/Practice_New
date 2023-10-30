package SeleniumPractice;

import java.io.IOException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BrokenLink2 extends Launch {

	@Test
	public void brokenLink() throws IOException {
	//	launchApp();
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for(int i =0; i<links.size(); i++) {
			String url = links.get(i).getAttribute("href");
			URL urlValue = new URL(url);
			HttpsURLConnection httpUrlConnection =(HttpsURLConnection) urlValue.openConnection(); 
			httpUrlConnection.connect();
			int code = httpUrlConnection.getResponseCode();
			if(code == 200) {
				System.out.println("Url"+url +"Response Code is "+code);
			}
		}
	}

}
