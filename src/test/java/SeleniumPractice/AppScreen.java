/**
 * 
 */
package SeleniumPractice;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;
/**
 * @author user
 *
 */
public class AppScreen extends AppWeb {

	@Test
	public void appUser() throws IOException {
		new AppWeb().setup();
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(file,
				new File(System.getProperty("user.dir") + "\\src\\test\\resources\\test.png"));

	}

}
