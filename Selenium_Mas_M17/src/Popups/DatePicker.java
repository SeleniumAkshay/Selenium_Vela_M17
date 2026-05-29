package Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://jqueryui.com/datepicker/");

		driver.switchTo().frame(0);
//		driver.findElement(By.id("datepicker")).sendKeys("05/31/2027");

		driver.findElement(By.id("datepicker")).click();
		driver.findElement(By.xpath("//a[text()='20']")).click();

		Thread.sleep(3000);
		driver.quit();

	}

}
