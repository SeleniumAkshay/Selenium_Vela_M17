package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_ByAttribute {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@role='button']")).click();
		driver.findElement(By.xpath("(//input[@name='q'])[1]")).sendKeys("redmi" + Keys.ENTER);

		Thread.sleep(3000);
		driver.quit();

	}

}
