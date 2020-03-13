import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitEx {
	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Madhav\\Selenium Classes\\chromedriver.exe");
		WebDriver d1 = new ChromeDriver();

		d1.get("http://newtours.demoaut.com/");

		d1.findElement(By.linkText("SIGN-ON")).click();

		d1.findElement(By.name("userName")).sendKeys("mercury");
		d1.findElement(By.name("password")).sendKeys("mercury");
		Thread.sleep(5000);

		d1.findElement(By.name("login")).click();
// Thread.sleep(5000);

		WebDriverWait x = new WebDriverWait(d1, 50);
		x.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("SIGN-OFF")));

		d1.findElement(By.linkText("SIGN-OFF")).click();
		d1.close(); // Or d1.quit() To Close Browser

	}
}