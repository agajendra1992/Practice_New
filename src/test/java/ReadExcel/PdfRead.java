package ReadExcel;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.testng.Assert;

import SeleniumPractice.Launch;

public class PdfRead extends Launch {
	public static String url = "file:\\C:/Users\\user\\Desktop\\HDFC.pdf";

	public static void main(String[] args) throws IOException {
		Launch launch = new Launch();
		//launch.launchApp();
		driver.navigate().to(url);
		PdfRead pdfRead = new PdfRead();
		pdfRead.pdfValidation();
		driver.quit();

	}

	public void pdfValidation() throws IOException {

		URL pdfUrl = new URL(url);
		InputStream inp = pdfUrl.openStream();
		BufferedInputStream bif = new BufferedInputStream(inp);
		PDDocument pdfDoc = PDDocument.load(bif);

		// PageCount
		int pagesCount = pdfDoc.getNumberOfPages();
		System.out.println("Pdf Page Count::" + pagesCount);
		Assert.assertEquals(pagesCount, 3);

		System.out.println("====================================================================================");
		// pdf Text
		PDFTextStripper pdfTextStripper = new PDFTextStripper();
		String pdText = pdfTextStripper.getText(pdfDoc);
		System.out.println(pdText);
		Assert.assertTrue(pdText.contains("MR GAJENDRA SAXENA"));
		Assert.assertTrue(pdText.contains("7829957229"));
		Assert.assertTrue(pdText.contains("Home LogoutWelc me Gajendra Saxena"));
		System.out.println(
				"===============================Particular Page Start =================================================");
		pdfTextStripper.setStartPage(2);
		String pdText1 = pdfTextStripper.getText(pdfDoc);
		System.out.println(pdText1);
		Assert.assertTrue(pdText1.contains("Home LogoutWelc me Gajendra Saxena"));
	}

}
