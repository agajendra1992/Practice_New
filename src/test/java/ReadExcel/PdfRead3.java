package ReadExcel;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.junit.Assert;

import SeleniumPractice.Launch;

public class PdfRead3 extends Launch {
	public static String url = "C:\\Users\\user\\Desktop\\ISTQB_CT-TAE_Sample-Exam-A-Questions_v1.1.pdf";

	public static void main(String[] args) throws IOException {
		Launch launch = new Launch();
	//	launch.launchApp();
		driver.navigate().to(url);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		PdfRead3 pd = new PdfRead3();
		pd.pdfValidation(currentUrl);
		driver.quit();
	}
	
	public void pdfValidation(String url) throws IOException {
		URL urlVal = new URL(url);
		InputStream inp = urlVal.openStream();
		BufferedInputStream binp = new BufferedInputStream(inp);
		PDDocument pdDoc = PDDocument.load(binp);
	    int pageCount = pdDoc.getNumberOfPages();
		System.out.println(pageCount);

		//PDF text Data Validation
		PDFTextStripper pdfTextStripper = new PDFTextStripper();
		String textData = pdfTextStripper.getText(pdDoc);
		System.out.println(textData);
		boolean value = textData.contains("Interoperability");
		Assert.assertEquals(value, true);
		boolean s = textData.contains("Controllability");
		Assert.assertEquals("Data is validate", s, true);
		boolean a = textData.contains("Test Automation Engineering, Specialist");
		Assert.assertEquals("Data is validate", a, true);
	}

}
