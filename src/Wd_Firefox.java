import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Wd_Firefox {
	public static void main(String args[]) throws Exception {

		System.setProperty("webdriver.firefox.marionette", "D:\\Madhav\\Selenium Classes\\geckodriver64.exe");

		WebDriver d1 = new FirefoxDriver();

		d1.get("http://newtours.demoaut.com/");

		d1.findElement(By.linkText("SIGN-ON")).click();

		d1.findElement(By.name("userName")).sendKeys("mercury");
		d1.findElement(By.name("password")).sendKeys("mercury");
		Thread.sleep(5000);

		d1.findElement(By.name("login")).click();
		Thread.sleep(5000);

		d1.findElement(By.linkText("SIGN-OFF")).click();
		d1.close(); // Or d1.quit() To Close Browser

	}
}