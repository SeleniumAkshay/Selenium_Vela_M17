package Wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitUrl {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlContains("selenium"));

		driver.findElement(By.xpath("//span[text()='Downloads']")).click();

		wait.until(ExpectedConditions.titleContains("Downloads"));

		driver.findElement(By.xpath("//span[text()='Projects']")).click();

		Thread.sleep(3000);
		driver.quit();

	}

}
