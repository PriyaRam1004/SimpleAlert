package automationpractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\thiru\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://letcode.in/table");
		WebElement table = driver.findElement(By.xpath("//table[@id='simpletable']"));
		List<WebElement> headers = table.findElements(By.tagName("th"));
		for (WebElement header : headers) {
			String text = header.getText();
			System.out.println(text);
		}
		List<WebElement> allrows = table.findElements(By.cssSelector("tbody tr"));
		int rows = allrows.size();
		System.out.println(rows);
		for (WebElement rows1 : allrows) {
			List<WebElement> colums = rows1.findElements(By.tagName("td"));
			WebElement firstcolums = colums.get(0);
			System.out.println(firstcolums.getText());
		}
		driver.quit();
	}

}
