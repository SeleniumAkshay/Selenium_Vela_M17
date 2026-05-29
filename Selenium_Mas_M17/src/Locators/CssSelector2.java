package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");

		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("qsp@gmail.com");
		driver.findElement(By.cssSelector("input.x1i10hfl[type='password']")).sendKeys("Qsp@1234");
		Thread.sleep(3000);
		driver.findElements(By.cssSelector("span.x1lliihq")).get(2).click();

		Thread.sleep(3000);
		driver.quit();

	}

}
