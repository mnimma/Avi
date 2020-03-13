import java.io.FileInputStream;
import jxl.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WebdriverExcel 
{
private WebDriver d1;

@BeforeClass
public void startup()
{
System.setProperty("webdriver.chrome.driver", "D:\\Madhav\\Selenium Classes\\chromedriver.exe");
d1 = new ChromeDriver();

}

@Test(description="Login")
public void login() throws Exception
{
Reporter.log("Test Case Steps");

d1.get("http://newtours.demoaut.com/");
Reporter.log("1. Application Opened");

d1.findElement(By.linkText("SIGN-ON")).click();
Reporter.log("2. Login Page Opened");

FileInputStream f1=new FileInputStream("D:\\Madhav\\Selenium Classes\\b.xls");
Workbook w1= Workbook.getWorkbook(f1);
Sheet s1=w1.getSheet("Sheet1");

try
{
int rows = s1.getRows();
for(int i=1;i<rows;i++)
{
String x=s1.getCell(0,i).getContents();
String y=s1.getCell(1,i).getContents();

d1.findElement(By.name("userName")).sendKeys(x);
Reporter.log("3. Type User Name From Excel " + x);

d1.findElement(By.name("password")).sendKeys(y);
Reporter.log("4. Type Password From Excel " + y);

Thread.sleep(5000);

d1.findElement(By.name("login")).click();
Reporter.log("5. Login Clicked");

Thread.sleep(5000);

if (d1.getTitle().equals("Find a Flight: Mercury Tours:"))
{
Reporter.log("Login Successful");
d1.findElement(By.linkText("SIGN-OFF")).click();
Reporter.log("6.Logout completed");
}
else
{
Reporter.log("Login Fail");
}


}

}
catch (Exception e)
{
System.out.println(e);
}

}

@AfterClass
public void end()
{
d1.quit();
}
}