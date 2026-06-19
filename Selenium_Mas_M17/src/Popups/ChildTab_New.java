package Popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ChildTab_New {

	public static void main(String[] args) throws InterruptedException, AWTException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/");

		String id = driver.getWindowHandle();
		System.out.println(id);

		Actions actions = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//span[text()='Forgotten password?']"));
		actions.contextClick(ele).pause(2000).perform();

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(2000);
		Set<String> ids = driver.getWindowHandles();
		ids.remove(id);

		for (String a : ids) {
			driver.switchTo().window(a);
			Thread.sleep(2000);
		}

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("1234567890");
		Thread.sleep(2000);
		driver.switchTo().window(id);

		Thread.sleep(3000);
		driver.quit();

	}

}
