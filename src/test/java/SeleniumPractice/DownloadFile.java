/**
 * 
 */
package SeleniumPractice;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author user
 *
 */
public class DownloadFile {

	/**
	 * @param args
	 */
	public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		String downloadPath = System.getProperty("user.dir") + "\\test-output\\downloadedFile";
		HashMap<String, Object> mapDownload = new HashMap<String, Object>();
		mapDownload.put("download.default_directory", downloadPath);
		mapDownload.put("download.prompt_for_download", false);
		options.setExperimentalOption("prefs", mapDownload);
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/upload-download");
		driver.findElement(By.xpath("//*[@id=\"downloadButton\"]")).click();
	}

}
