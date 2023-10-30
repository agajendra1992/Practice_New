package SeleniumPractice;

import java.sql.Driver;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.codoid.products.exception.FilloException;

import Practice03042023.ReadExcel1;

public class DataRead1 extends ReadExcel1 {
	@DataProvider(name = "TestData")
	public static Object[][] getData() throws FilloException {

		Object[][] o = new Object[1][];
		HashMap<String, List<String>> map = ReadExcel1.getDataValue(ReadExcel1.excelPath, ReadExcel1.sheet);
		o[0] = new Object[] { map };

		return o;
	}

	@Test(dataProvider = "TestData")
	public void testDataValue(HashMap<String, List<String>> mapData) throws InterruptedException {
		Launch l = new Launch();
		//l.launchApp();
		
		WebElement ele = l.driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/textarea"));
		for(int i = 0; i<mapData.get("FirstName").size(); i++) {
			ele.sendKeys(mapData.get("FirstName").get(i));
			Thread.sleep(2000);
			ele.clear();
		}
		l.driver.close();
		//System.out.println(mapData.get("Phone"));
		//System.out.println("FirstName data is:: " + mapData.get("FirstName"));
	}

}
