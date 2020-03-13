import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WDLoginProp {
	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Madhav\\Selenium Classes\\chromedriver.exe");

		WebDriver d1 = new ChromeDriver();

		d1.get("http://newtours.demoaut.com/");

		d1.findElement(By.linkText("SIGN-ON")).click();

		if (d1.findElement(By.name("login")).isEnabled()) {
			System.out.println("Before data Login Button is Enable");
		} else {
			System.out.println("Before data Login Button is Disable");
		}

		d1.findElement(By.name("userName")).sendKeys("mercury");
		d1.findElement(By.name("password")).sendKeys("mercury");

		Thread.sleep(5000);

		if (d1.findElement(By.name("login")).isEnabled()) {
			System.out.println("After data Login Button is Enable");
		} else {
			System.out.println("After data Login Button is Disable");
		}
		d1.close();

	}

}
