import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wd_Loginfo 
{
public static void main(String args[])throws Exception
{
System.setProperty("webdriver.chrome.driver", "D:\\Madhav\\Selenium Classes\\chromedriver.exe");
WebDriver d1 = new ChromeDriver();

d1.manage().window().maximize(); // To Maximize Browser

d1.get("http://newtours.demoaut.com/");


if(d1.getTitle().equals("Welcome: Mercury Tours"))

System.out.println("Application Opened");
else

System.out.println("Application Not Opened");



d1.findElement(By.linkText("SIGN-ON")).click();
d1.findElement(By.name("userName")).sendKeys("mercury");
d1.findElement(By.name("password")).sendKeys("mercury");

Thread.sleep(5000);

d1.findElement(By.name("login")).click();

Thread.sleep(5000);


if(d1.getTitle().equals("Find a Flight: Mercury Tours:"))

System.out.println("Login Completed");
else
System.out.println("Login Faild");


d1.findElement(By.linkText("SIGN-OFF")).click();

Thread.sleep(5000);


if(d1.getTitle().equals("Sign-on: Mercury Tours"))

System.out.println("LogOut Completed");
else
System.out.println("LogOut Not Completed");

d1.close(); // Or d1.quit() To Close Browser

}
}