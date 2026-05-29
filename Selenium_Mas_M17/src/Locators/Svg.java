package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Svg {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@role='button']")).click();

		driver.findElement(By.name("q")).sendKeys("Iphone");
		driver.findElement(By.xpath("(//button[@title='Search for Products, Brands and More'])[1]")).click();
//		driver.findElement(By.xpath("(//*[name()='svg'])[3]")).click();

		Thread.sleep(3000);
		driver.quit();

	}

}
