package AanchalPractise;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Program1 {
	WebDriver driver;
	@Test
	public void M4() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/checkbox");
	    driver.findElement(By.xpath("//*[contains(@class,'rct-checkbox')]")).click();
		String t1= driver.findElement(By.xpath("//*[@class='display-result mt-4']")).getText();
		resultMatch();
		assertEquals(resultMatch(), true);
	}
		 
	public boolean resultMatch() {
		boolean val = false;
		String t1 = driver.findElement(By.xpath("//*[@class='display-result mt-4']")).getText();
		System.out.println(t1.replace("\n", ""));
		String t2 = "You have selected :homedesktopnotescommandsdocumentsworkspacereactangularveuofficepublicprivateclassifiedgeneraldownloadswordFileexcelFile";
		val = t1.replace("\n", "").equals(t2);
		return val;
	}}
	


