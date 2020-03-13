
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Madhav\\Selenium Classes\\chromedriver.exe");

		WebDriver d1 = new ChromeDriver();

		d1.manage().window().maximize();

		d1.get("http://newtours.demoaut.com/");
//d1.navigate().to("http://newtours.demoaut.com/");
		d1.findElement(By.linkText("SIGN-ON")).click();
		d1.findElement(By.name("userName")).sendKeys("mercury");
		d1.findElement(By.name("password")).sendKeys("mercury");
		Thread.sleep(5000);
		d1.findElement(By.name("login")).click();
		Thread.sleep(5000);
		d1.findElement(By.xpath("//input[@name='servClass'][2]")).click(); // Select The Radio Button
		// d1.findElement(By.xpath("//input[@value='First']")).click(); // Select The
		// Radio Button
		d1.findElement(By.name("findFlights")).click();
		Thread.sleep(5000);
		d1.findElement(By.name("reserveFlights")).click();
		Thread.sleep(5000);
		d1.findElement(By.name("ticketLess")).click(); // Select The Check Box
		d1.findElement(By.linkText("SIGN-OFF")).click();
		d1.close(); // Or d1.quit() To Close Browser

	}
}