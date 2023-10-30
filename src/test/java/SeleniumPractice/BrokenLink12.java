package SeleniumPractice;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BrokenLink12 extends Launch {

	public static void main(String[] args) throws IOException {
		Launch launch = new Launch();
		//launch.launchApp();
		List<WebElement> eleList = driver.findElements(By.tagName("a"));
		for(int i = 0; i<eleList.size();i++) {
			String url  = eleList.get(i).getAttribute("href");
			URL urlVal = new URL(url);
			HttpsURLConnection htturlConnection = (HttpsURLConnection) urlVal.openConnection();
			htturlConnection.connect();
			int code = htturlConnection.getResponseCode();
			if(code == 200) {
				System.out.println("Response code ::"+ code);
			}
			
			
		}
driver.quit();
	}

}
