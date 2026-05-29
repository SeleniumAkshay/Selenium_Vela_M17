package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://demowebshop.tricentis.com/");

//		driver.findElement(By.className("ico-login")).click();

		driver.get("https://www.flipkart.com/");

		Thread.sleep(3000);
		driver.findElement(By.className("b3wTlE")).click();
		driver.findElement(By.name("q")).sendKeys("iphone" + Keys.ENTER);
//		driver.findElement(By.className("RG5Slk")).click();
		driver.findElements(By.className("RG5Slk")).get(1).click();

		Thread.sleep(3000);
		driver.quit();

	}

}
