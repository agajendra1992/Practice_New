package SeleniumPractice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BrokenLinks11 extends Launch {

	public static void main(String[] args) throws IOException {
		Launch l = new Launch();
		//l.launchApp();
		List<WebElement> eleList = driver.findElements(By.tagName("a"));
		for (int i = 0; i < eleList.size(); i++) {
			String url = eleList.get(i).getAttribute("href");
			URL urlValue = new URL(url);
			HttpURLConnection connection = (HttpURLConnection) urlValue.openConnection();
			connection.connect();
			int responseCode = connection.getResponseCode();
			if (responseCode == 200) {
				System.out.println("Response Code is " + responseCode);
			}

		}
		driver.quit();
	}

}
