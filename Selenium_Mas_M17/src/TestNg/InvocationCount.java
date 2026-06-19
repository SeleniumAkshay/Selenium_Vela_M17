package TestNg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvocationCount {

	@Test(invocationCount = 5, threadPoolSize = 10)
	public void register() throws InterruptedException {
		System.out.println("Register Test");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");

		System.out.println("Title of the page is: " + driver.getTitle());
//		driver.findElement(By.id("scqw")).click();

		Thread.sleep(1000);
		driver.quit();

	}

}
