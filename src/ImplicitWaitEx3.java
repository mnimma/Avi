
// The implicit wait will tell to the web driver to wait for certain amount of time before it throws a "No Such Element Exception". The default setting is 0. Once we set the time, web driver will wait for that time before throwing an exception.

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitEx3 {
	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Madhav\\Selenium Classes\\chromedriver.exe");
		WebDriver d1 = new ChromeDriver();

		d1.get("http://newtours.demoaut.com/");

		d1.findElement(By.linkText("SIGN-ON")).click();

		d1.findElement(By.name("userName")).sendKeys("mercury");
		d1.findElement(By.name("password")).sendKeys("mercury");

		Thread.sleep(5000);

		d1.findElement(By.name("login")).click();

		d1.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS); // It Works Like Wait For PageToLoad

		d1.findElement(By.linkText("SIGN-OFF")).click();
		d1.close(); // Or d1.quit() To Close Browser

	}
}