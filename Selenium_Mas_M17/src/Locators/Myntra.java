package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");

		Thread.sleep(2000);
		driver.findElement(By.linkText("Men")).click();

		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());

		Thread.sleep(3000);
		driver.quit();

	}

}
