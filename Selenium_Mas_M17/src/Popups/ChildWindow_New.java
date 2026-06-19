package Popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindow_New {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://secure.indeed.com/auth?hl=en&continue=%2Fsettings%2Faccount");

		String id = driver.getWindowHandle();
		System.out.println(id);

		driver.findElement(By.xpath("//span[text()='Continue with Apple']")).click();
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//span[text()='Continue with Google']")).click();

		Thread.sleep(3000);
		Set<String> ids = driver.getWindowHandles();
		ids.remove(id);
		for (String a : ids) {
			driver.switchTo().window(a);
			String title = driver.getTitle();
			if (title.contains("Apple")) {
				driver.findElement(By.id("account_name_text_field")).sendKeys("Vamsi");
				break;
			}
		}

		Thread.sleep(3000);
		driver.quit();

	}

}
