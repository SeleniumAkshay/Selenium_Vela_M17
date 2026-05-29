package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");

		Thread.sleep(3000);

		WebElement ele = driver.findElement(By.id("name"));
		ele.sendKeys("Abc");
		Thread.sleep(4000);
		ele.clear();

		Thread.sleep(3000);
		driver.quit();

	}

}
