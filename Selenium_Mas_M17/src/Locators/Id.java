package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");

//		WebElement firstName = driver.findElement(By.id("FirstName"));
//		firstName.sendKeys("Hari");

		driver.findElement(By.id("FirstName")).sendKeys("Hari");
		Thread.sleep(2000);
		driver.findElement(By.id("register-button")).click();

//		WebElement registerBtn = driver.findElement(By.id("register-button"));
//		registerBtn.click();

		Thread.sleep(3000);
		driver.quit();

	}

}
