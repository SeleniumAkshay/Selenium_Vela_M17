package TestNg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Facebook {

	@Test
	public void facebook() throws InterruptedException {
		System.out.println("Facebook Test");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/");

		System.out.println(driver.getTitle());

		Thread.sleep(3000);
		driver.quit();

	}

}
