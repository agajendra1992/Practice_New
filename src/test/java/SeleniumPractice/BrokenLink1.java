package SeleniumPractice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLink1 {

	public static WebDriver driver;

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com/");

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Url Link :: " + links.size());

		for (int i = 0; i < links.size(); i++) {
			String url = links.get(i).getAttribute("href");
			URL urlValue = new URL(url);
			HttpURLConnection connection = (HttpURLConnection) urlValue.openConnection();
			connection.connect();
			int code = connection.getResponseCode();
			System.out.println(code ==200);{
				System.out.println("Url is ::"+urlValue +"   ::"+ code);
			}
		}
	}

}
