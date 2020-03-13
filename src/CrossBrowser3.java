
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser3 {
	private WebDriver d1;

	@Parameters({ "browser" })
	@BeforeClass
	public void startup(String browser) {
		if (browser.equals("FF")) {
			System.setProperty("webdriver.firefox.marionette", "D:\\Madhav\\Selenium Classes\\geckodriver.exe");
			d1 = new FirefoxDriver();
		}

		else if (browser.equals("IE")) {
			System.setProperty("webdriver.ie.driver", "G:\\Selenium Satish Metirial\\IEDriverServer.exe");
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
		Reporter.log("5. Login completed");

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
