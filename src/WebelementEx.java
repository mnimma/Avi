import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebelementEx {
	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Madhav\\Selenium Classes\\chromedriver.exe");

		WebDriver d1 = new ChromeDriver();

		d1.get("http://newtours.demoaut.com/");

		d1.findElement(By.linkText("SIGN-ON")).click();

		WebElement unm = d1.findElement(By.name("userName"));

		if (unm.isEnabled()) // isEnable Returns True Or False
		{
			System.out.println("UserName In Enable");
			unm.sendKeys("mercury");
		} else
			System.out.println("UserName In Disable");

		d1.findElement(By.name("password")).sendKeys("mercury");

		Thread.sleep(5000);

		if (d1.findElement(By.name("login")).isDisplayed()) // isDisplayed Returns True Or False
		{
			System.out.println("login Displayed");
			d1.findElement(By.name("login")).click();

		}

		else
			System.out.println("login Button Is Not Displayed");

		Thread.sleep(5000);

		d1.findElement(By.linkText("SIGN-OFF")).click();

		d1.close(); // Or d1.quit() To Close Browser

	}
}