package Popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindow {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui/browser/multipleWindow?sublist=2");

		String id = driver.getWindowHandle();
		System.out.println(id);
		System.out.println();

		driver.findElement(By.xpath("//button[text()='Shop Now']")).click();

		Thread.sleep(2000);
		Set<String> ids = driver.getWindowHandles();
		ids.remove(id);
		for (String string : ids) {

			driver.switchTo().window(string);
			String title = driver.getTitle();
			if (title.contains("Laptop")) {
				break;
			}

		}

		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Add to Cart']")).click();
		Thread.sleep(2000);
		driver.switchTo().window(id);

		Thread.sleep(3000);
		driver.quit();
//		driver.close();

	}

}
