package TestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Whatsapp {

	@Test
	public void whatsapp() throws InterruptedException {
		System.out.println("Whatsapp Test");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.whatsapp.com/");

		driver.findElement(By.xpath("//span[text()='Features']")).click();

		Thread.sleep(3000);
		driver.quit();

	}

}
