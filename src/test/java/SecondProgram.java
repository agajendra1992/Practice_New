import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SecondProgram {
WebDriver driver;
@Test
public void m2()
{
	WebDriverManager.chromedriver().setup();
	driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"))
	.sendKeys("Facebook");
	driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"))
	.sendKeys(Keys.ENTER);
	//driver.findElement(By.xpath("")).click();
	
}
}
