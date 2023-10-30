package SeleniumPractice;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

@Test
public class BrokenLink5 extends Launch{

	public void verifyBrokenLink() throws IOException {
		Launch launch = new Launch();
	//	launch.launchApp();
		
		List<WebElement> listUrl = driver.findElements(By.tagName("a"));
		for(int i =0; i<listUrl.size(); i++) {
			String url = listUrl.get(i).getAttribute("href");
			URL val = new URL(url);
			HttpsURLConnection connection =( HttpsURLConnection) val.openConnection();
			connection.connect();
			int response = connection.getResponseCode();
			if(response==200) {
				System.out.println("response code is "+ response);
			}
		}
	}
}
