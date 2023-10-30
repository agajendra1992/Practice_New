/**
 * 
 */
package SeleniumPractice;

import java.util.Arrays;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author user
 *
 */
public class Incognito {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("--incognito");
		HashMap<String, Integer>contentSettings = new HashMap<String, Integer>();
		HashMap<String, Object>profile = new HashMap<String, Object>();
		HashMap<String, Object>prefs = new HashMap<String, Object>();
		contentSettings.put("geolocation", 2);
		contentSettings.put("notifications", 2);
		profile.put("managed_default_content_settings", contentSettings);
		prefs.put("profile", profile);
		
		options.setExperimentalOption("prefs", prefs);
		//options.addArguments("--remote-allow-origins");
		//options.addArguments("disable-notification");
		//options.addArguments("disable-geolocation");
		options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.easemytrip.com/");

	}

}
