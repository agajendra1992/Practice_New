/**
 * 
 */
package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author user
 *
 */
public class AppWeb {
	public static WebDriver driver;
	public void setup() {
	WebDriverManager.chromedriver().setup();
	ChromeOptions chromeOption = new ChromeOptions();
	chromeOption.addArguments("--remote-allow-origins=*");
	//chromeOption.setHeadless(true);
	driver = new ChromeDriver(chromeOption);
	driver.manage().window().maximize();
	
	driver.get("http://www.google.com/");
	//driver.quit();
	}
}
