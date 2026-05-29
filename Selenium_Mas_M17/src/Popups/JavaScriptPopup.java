package Popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptPopup {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.automationtesting.in/Alerts.html");

		driver.findElement(By.xpath("//button[contains(text(),'alert box')]")).click();

		Thread.sleep(2000);
//		driver.switchTo().alert().dismiss();
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();

		driver.findElement(By.partialLinkText("Alert with OK & Cancel")).click();
		driver.findElement(By.xpath("//button[contains(text(),'confirm box')]")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();

		driver.findElement(By.partialLinkText("Alert with Textbox")).click();
		driver.findElement(By.xpath("//button[contains(text(),'prompt box')]")).click();

		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Hari");
		Thread.sleep(2000);
		alert.accept();

		Thread.sleep(3000);
		driver.quit();

	}

}
