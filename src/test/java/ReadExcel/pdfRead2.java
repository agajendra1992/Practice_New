package ReadExcel;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.openqa.selenium.By;

import SeleniumPractice.Launch;

public class pdfRead2 extends Launch {

	public static void main(String[] args) throws IOException, InterruptedException {
		Launch launch = new Launch();
	//	launch.launchApp();
		driver.navigate().to("https://www.inkit.com/blog/pdf-the-best-digital-document-management");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@id='ecSubmitAgreeButton']")).click();
		driver.findElement(By.xpath("//a[text()='trillions of PDFs']")).click();
		String url = driver.getCurrentUrl();
		URL pdfurl = new URL(url);
		URLConnection urlConnection =pdfurl.openConnection();
		urlConnection.addRequestProperty("User-Agent", "Mozilla");
		InputStream inpStream = urlConnection.getInputStream();
		BufferedInputStream bif = new BufferedInputStream(inpStream);
		PDDocument pdDoc = PDDocument.load(bif);
		int pageCount = pdDoc.getNumberOfPages();
		System.out.println("Page Count is "+ pageCount);
		driver.quit();

	}

}
