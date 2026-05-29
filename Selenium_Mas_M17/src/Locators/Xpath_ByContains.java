package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_ByContains {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[contains(@placeholder,'Search')])[1]"))
				.sendKeys("iPhone 14 Pro Max" + Keys.ENTER);

		Thread.sleep(3000);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//span[contains(text(),'Create')]")).click();

		Thread.sleep(3000);
		driver.quit();

	}

}
