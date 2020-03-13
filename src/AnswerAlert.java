import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AnswerAlert {
	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Madhav\\Selenium Classes\\chromedriver.exe");

		WebDriver d1 = new ChromeDriver();

		d1.manage().window().maximize(); // To Maximize Browser

		d1.get("file:///D:/Madhav/Selenium%20Classes/HtmlProg/name.html");
		d1.findElement(By.linkText("Click here to enter your name")).click();

		Alert x = d1.switchTo().alert();

		x.sendKeys("Ramesh");
		x.accept();
		Thread.sleep(5000);
		d1.close();
	}
}