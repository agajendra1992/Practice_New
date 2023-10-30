package SeleniumPractice;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BrokenLink13 extends Launch {

	public static void main(String[] args) throws IOException {
		Launch launchapp = new Launch();
		//launchapp.launchApp();
		List<WebElement> elementsList = driver.findElements(By.tagName("a"));
		for (int i = 0; i < elementsList.size(); i++) {
			String url = elementsList.get(i).getAttribute("href");
			URL urlValue = new URL(url);
			HttpsURLConnection connection = (HttpsURLConnection) urlValue.openConnection();
			connection.connect();
			int rescode = connection.getResponseCode();
			if (rescode == 200) {
				System.out.println(rescode + "is not Brokenlink");

			}

			else {
				System.out.println(rescode + "is Brokenlink");
			}
		}

	}

}
