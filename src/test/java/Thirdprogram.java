import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Thirdprogram {
	WebDriver driver;
	@Test
	public void m3() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		int i;
		for(i=1;i<=5;i++) {
		driver.get("https://demoqa.com/text-box");
		driver.findElement(By.id("userName")).sendKeys("Aanchal");
		driver.findElement(By.id("userEmail")).sendKeys("Asthana@123.com");
		driver.findElement(By.id("currentAddress")).sendKeys("11/298Bangalore");
		driver.findElement(By.id("permanentAddress")).sendKeys("same as above");
		driver.findElement(By.id("submit")).click();}
		//System.out.println("Executed count="+i);
		String d = driver.findElement(By.xpath("//div[@id='output']")).getText();
		System.out.println("Expected value\n"+d);
	}

}
