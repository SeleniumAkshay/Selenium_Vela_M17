package Popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildTab {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(
				"https://www.flipkart.com/search?q=iphone&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off&as-pos=1&as-type=HISTORY");

		String id = driver.getWindowHandle();
		System.out.println(id);
		System.out.println();

		driver.findElement(By.xpath("(//div[@class='RG5Slk'])[1]")).click();

		Set<String> ids = driver.getWindowHandles();
		ids.remove(id);
		for (String string : ids) {
			System.out.println(string);
			driver.switchTo().window(string);
		}

		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Buy now']")).click();
		Thread.sleep(2000);
		driver.switchTo().window(id);

		Thread.sleep(3000);
		driver.quit();
//		driver.close();

	}

}
