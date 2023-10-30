package SeleniumPractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class TestLogin extends Launch {

	Logger log = Logger.getLogger(TestLogin.class);

	@Test
	@Parameters({ "browser" })
	public void verifyGoogle(String browser) {
		log.info("log lauch");
		Launch launch = new Launch();
		launch.launchApp(browser);
		driver.quit();
	}
}
