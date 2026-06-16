package Popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivision {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.automationtesting.in/Alerts.html");

		driver.findElement(By.xpath("//button[contains(text(),'alert')]")).click();
		driver.switchTo().alert().accept();

		driver.findElement(By.partialLinkText("Alert with OK & Cancel")).click();
		driver.findElement(By.xpath("//button[contains(text(),'confirm')]")).click();

		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();

		driver.findElement(By.partialLinkText("Alert with Textbox")).click();
		driver.findElement(By.xpath("//button[contains(text(),'prompt')]")).click();

		Alert b = driver.switchTo().alert();
		b.sendKeys("Hari");
		Thread.sleep(3000);
		b.accept();

		Thread.sleep(3000);
		driver.quit();

	}

}
