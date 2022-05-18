package automationpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	private static org.openqa.selenium.Alert alert;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\thiru\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://letcode.in/alert");
		driver.findElement(By.id("accept")).click();
		alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println("My simple Alert: " + text);
		alert.accept();

	}

}
