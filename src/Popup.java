import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup {
	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Madhav\\Selenium Classes\\chromedriver.exe");

		WebDriver d1 = new ChromeDriver();

		d1.manage().window().maximize(); // To Maximize Browser

		d1.get("file:///D:/Madhav/Selenium%20Classes/HtmlProg/VerifyAlerts_Age.html");
		d1.findElement(By.id("idSubGo")).click();
		Thread.sleep(5000);
		Alert x = d1.switchTo().alert();
		System.out.println(x.getText());
		x.accept();

		d1.close();
	}
}