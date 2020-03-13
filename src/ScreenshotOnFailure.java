
import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotOnFailure {
	public static void main(String[] args) throws Exception {
		WebDriver d1;

		System.setProperty("webdriver.chrome.driver", "D:\\Madhav\\Selenium Classes\\chromedriver.exe");
		d1 = new ChromeDriver();

		try {

			d1.get("http://www.google.com/");
			Date x = new Date();

			File f1 = ((TakesScreenshot) d1).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f1, new File("C:\\Selenium_image\\" + x.getTime() + ".png"));
			d1.close();

		} catch (Exception e) {

		}

	}

}