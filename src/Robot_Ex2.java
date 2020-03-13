
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Robot_Ex2 {
	public WebDriver driver;

	@BeforeMethod
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Madhav\\Selenium Classes\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void testTestScenario1() throws Exception {
		driver.get("http://wikisend.com/");
		driver.findElement(By.id("uploadfield")).click();
		Thread.sleep(5000);

//creating instance of Robot class (A java based utility)
		Robot rb = new Robot();

//pressing keys with the help of keyPress and keyRelease events
		rb.keyPress(KeyEvent.VK_G);
		rb.keyRelease(KeyEvent.VK_G);
		Thread.sleep(2000);

		rb.keyPress(KeyEvent.VK_SHIFT);
		rb.keyPress(KeyEvent.VK_SEMICOLON);
		rb.keyRelease(KeyEvent.VK_SEMICOLON);
		rb.keyRelease(KeyEvent.VK_SHIFT);

		rb.keyPress(KeyEvent.VK_BACK_SLASH);
		rb.keyRelease(KeyEvent.VK_BACK_SLASH);
		Thread.sleep(2000);

		rb.keyPress(KeyEvent.VK_S);
		rb.keyRelease(KeyEvent.VK_S);

		rb.keyPress(KeyEvent.VK_E);
		rb.keyRelease(KeyEvent.VK_E);

		rb.keyPress(KeyEvent.VK_L);
		rb.keyRelease(KeyEvent.VK_L);

		rb.keyPress(KeyEvent.VK_E);
		rb.keyRelease(KeyEvent.VK_E);

		rb.keyPress(KeyEvent.VK_N);
		rb.keyRelease(KeyEvent.VK_N);

		rb.keyPress(KeyEvent.VK_I);
		rb.keyRelease(KeyEvent.VK_I);

		rb.keyPress(KeyEvent.VK_U);
		rb.keyRelease(KeyEvent.VK_U);

		rb.keyPress(KeyEvent.VK_M);
		rb.keyRelease(KeyEvent.VK_M);

		rb.keyPress(KeyEvent.VK_BACK_SLASH);
		rb.keyRelease(KeyEvent.VK_BACK_SLASH);
		Thread.sleep(2000);

		rb.keyPress(KeyEvent.VK_F);
		rb.keyRelease(KeyEvent.VK_F);

		rb.keyPress(KeyEvent.VK_I);
		rb.keyRelease(KeyEvent.VK_I);

		rb.keyPress(KeyEvent.VK_L);
		rb.keyRelease(KeyEvent.VK_L);

		rb.keyPress(KeyEvent.VK_E);
		rb.keyRelease(KeyEvent.VK_E);

		rb.keyPress(KeyEvent.VK_S);
		rb.keyRelease(KeyEvent.VK_S);

		rb.keyPress(KeyEvent.VK_BACK_SLASH);
		rb.keyRelease(KeyEvent.VK_BACK_SLASH);
		Thread.sleep(2000);

		rb.keyPress(KeyEvent.VK_P);
		rb.keyRelease(KeyEvent.VK_P);

		rb.keyPress(KeyEvent.VK_I);
		rb.keyRelease(KeyEvent.VK_I);

		rb.keyPress(KeyEvent.VK_C);
		rb.keyRelease(KeyEvent.VK_C);
		Thread.sleep(2000);

		rb.keyPress(KeyEvent.VK_PERIOD); // It Means Dot .
		rb.keyRelease(KeyEvent.VK_PERIOD);

		rb.keyPress(KeyEvent.VK_P);
		rb.keyRelease(KeyEvent.VK_P);

		rb.keyPress(KeyEvent.VK_N);
		rb.keyRelease(KeyEvent.VK_N);

		rb.keyPress(KeyEvent.VK_G);
		rb.keyRelease(KeyEvent.VK_G);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);

	}

	@AfterMethod
	public void tearDown() throws Exception {
		driver.quit();
	}
}