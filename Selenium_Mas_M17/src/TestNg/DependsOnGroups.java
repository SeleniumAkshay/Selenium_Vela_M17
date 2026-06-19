package TestNg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DependsOnGroups {

	@Test(groups = "regression")
	public void register() throws InterruptedException {
		System.out.println("Register Test");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");

		System.out.println("Title of the page is: " + driver.getTitle());
//		driver.findElement(By.id("scqw")).click();

		Thread.sleep(3000);
		driver.quit();

	}

	@Test(groups = "system",dependsOnGroups = "regression")
	public void login() throws InterruptedException {
		System.out.println("Login Test");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.whatsapp.com/");

		System.out.println("Title of the page is: " + driver.getTitle());
//		driver.findElement(By.id("scqw")).click();

		Thread.sleep(3000);
		driver.quit();

	}

}
