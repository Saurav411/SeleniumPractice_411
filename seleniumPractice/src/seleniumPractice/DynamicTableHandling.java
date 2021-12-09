package seleniumPractice;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DynamicTableHandling {

	@Test
	public void dynamicTableHandling() {
		WebDriver driver;
		// ChromeDriver driver= new ChromeDriver();
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "/seleniumPractice/chromedriver.exe");
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement baseTable = driver.findElement(By.tagName("table"));

		// To find third row of table
		WebElement tableRow = baseTable.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[3]"));
		String rowtext = tableRow.getText();
		System.out.println("Third row of table : " + rowtext);

		// to get 3rd row's 2nd column data
		WebElement cellIneed = tableRow.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[3]/td[2]"));
		String valueIneed = cellIneed.getText();
		System.out.println("Cell value is : " + valueIneed);
		driver.close();
	}
}
