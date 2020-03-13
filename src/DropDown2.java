import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown2 {
	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Madhav\\Selenium Classes\\chromedriver.exe");

		WebDriver d1 = new ChromeDriver();

		d1.manage().window().maximize(); // To Maximize Browser

		d1.get("file:///D:/Madhav/Selenium%20Classes/HtmlProg/goBackAndWait.html");
//d1.findElement(By.name("OptWeb")).sendKeys("Google");
		Select x = new Select(d1.findElement(By.name("OptWeb")));
		x.selectByIndex(0);
		d1.findElement(By.name("btnGo")).click();
		Thread.sleep(5000);
		System.out.println(d1.getTitle());
		d1.navigate().back();
		Thread.sleep(5000);
//d1.findElement(By.name("OptWeb")).sendKeys("Bigbasket");
		Select y = new Select(d1.findElement(By.name("OptWeb")));
		y.selectByVisibleText("Google");
		d1.findElement(By.name("btnGo")).click();
		Thread.sleep(5000);
		System.out.println(d1.getTitle());
		d1.navigate().back();

		d1.close();
	}
}