import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "D:\\Madhav\\Selenium Classes\\chromedriver.exe");

		WebDriver d1 = new ChromeDriver();

		d1.manage().window().maximize(); // To Maximize Browser

		d1.get("file:///D:/Madhav/Selenium%20Classes/HtmlProg/WebtableTable.html");

		int row = d1.findElements(By.xpath("//table[@id='idCourse']/tbody/tr")).size();
		int col = d1.findElements(By.xpath("//table[@id='idCourse']/tbody/tr[1]/td")).size();

		System.out.println("Number Of Rows = " + row);
		System.out.println("Number Of Columns In 1st Row = " + col);

		String x = d1.findElement(By.xpath("//table[@id='idCourse']/tbody/tr[2]/td[2]")).getText();
		System.out.println(x);

		for (int i = 1; i <= row; i++) {

			String y = d1.findElement(By.xpath("//table[@id='idCourse']/tbody/tr[" + i + "]")).getText();
			System.out.println(y);

		}

		d1.close();
	}
}