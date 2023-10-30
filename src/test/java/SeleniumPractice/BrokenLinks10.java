package SeleniumPractice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BrokenLinks10 extends Launch {

	public static void main(String[] args) throws IOException {
		Launch launch = new Launch();
		//launch.launchApp();
		List<WebElement> eleList = driver.findElements(By.tagName("a"));

		for (int i = 0; i < eleList.size(); i++) {
			String url = eleList.get(i).getAttribute("href");
			URL urlValue = new URL(url);
			HttpURLConnection connection = (HttpURLConnection) urlValue.openConnection();
			connection.connect();
			int code = connection.getResponseCode();
			if (code == 200) {
				System.out.println("Response Code is " + code);
			}

		}
		driver.close();
	}

}
