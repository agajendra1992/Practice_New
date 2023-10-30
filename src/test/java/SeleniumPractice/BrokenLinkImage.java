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

public class BrokenLinkImage {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
         System.out.println(links.size());
         for(int i =0; i<links.size(); i++) {
        	 String url = links.get(i).getAttribute("href");
        	 try {
				URL urlLink = new URL(url);
				try {
					HttpURLConnection httpConn = (HttpURLConnection) urlLink.openConnection();
					httpConn.connect();
					int code = httpConn.getResponseCode();
					if(code == 200) {
						System.out.println("Working link is ::"+ url +"response code is ::"+code);
					}
					httpConn.disconnect();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
         }
       driver.quit();
	}

}
