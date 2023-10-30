package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launch {

	public static WebDriver driver;
	
	
	public void launchApp(String browser) {
		if(browser.equals("chrome")) {
	WebDriverManager.chromedriver().setup();
	ChromeOptions chromeOption = new ChromeOptions();
	chromeOption.addArguments("--remote-allow-origins=*");
	//chromeOption.setHeadless(true);
	driver = new ChromeDriver(chromeOption);
		}
		else if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
		}
	driver.manage().window().maximize();
	
	driver.get("http://www.google.com/");
	//driver.quit();
	}
}
