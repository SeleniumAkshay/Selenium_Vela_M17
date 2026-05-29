package JSE;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextField {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,500);");
		Thread.sleep(2000);
		driver.findElement(By.id("hide-textbox")).click();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.id("displayed-text"));

		js.executeScript("arguments[0].value='Hello';", ele);

		Thread.sleep(2000);
		driver.findElement(By.id("show-textbox")).click();

		Thread.sleep(3000);
		driver.quit();

	}

}
