import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class progromselect {
	public static WebDriver driver;

	@Test
	public void dropDownSelection() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		new progromselect().selectCountry("MALTA");
			//driver.close();
		}
	
//		WebElement Value1 = driver.findElement(By.xpath("//select[@name='country']"));
//		Select s1= new Select(Value1);
//			s1.selectByValue("ANGOLA");

	// }
//}
	public void selectCountry(String country) {
		List<WebElement> s = driver.findElements(By.xpath("//select[@name='country']//option"));
		System.out.println(s.size());
		for (int i = 0; i < s.size(); i++) {
			String city = s.get(i).getText();
			if (city.equals(country)) {
				s.get(i).click();
			}
		}
	}
}