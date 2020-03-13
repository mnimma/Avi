
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CrossBrowser1 {
	WebDriver d1;

	String browser = "IE";

	@BeforeClass
	public void startup() {
		if (browser.equals("FF")) {
			System.setProperty("webdriver.firefox.marionette", "D:\\Madhav\\Selenium Classes\\geckodriver.exe");
			d1 = new FirefoxDriver();
		}

		else if (browser.equals("IE")) {
			System.setProperty("webdriver.ie.driver", "D:\\Madhav\\Selenium Classes\\IEDriverServer.exe");
			d1 = new InternetExplorerDriver();
		}

		else if (browser.equals("GC")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Madhav\\Selenium Classes\\chromedriver.exe");
			d1 = new ChromeDriver();
		}

	}

	@Test(description = "Login")
	public void login() throws Exception {
		Reporter.log("Test Case Steps");

		d1.get("http://newtours.demoaut.com/");
		Reporter.log("1. Application Opened");

		d1.findElement(By.linkText("SIGN-ON")).click();
		Reporter.log("2. Login Page Opened");

		d1.findElement(By.name("userName")).sendKeys("mercury");
		Reporter.log("3. Type User Name");

		d1.findElement(By.name("password")).sendKeys("mercury");
		Reporter.log("4. Type Password");

		d1.findElement(By.name("login")).click();
		Reporter.log("5. Login Clicked");

		Thread.sleep(5000);

		if (d1.getTitle().equals("Find a Flight: Mercury Tours:")) {
			Reporter.log("Login Successful");
			d1.findElement(By.linkText("SIGN-OFF")).click();
			Reporter.log("6.Logout completed");
		} else {
			Reporter.log("Login Fail");
		}

	}

	@AfterClass
	public void end() {
		d1.quit();
	}

}
