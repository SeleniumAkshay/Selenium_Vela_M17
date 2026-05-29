package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");

//		driver.findElement(By.tagName("input")).sendKeys("Laptop", Keys.ENTER);

		List<WebElement> ele = driver.findElements(By.tagName("input"));

		ele.get(0).sendKeys("Laptop");
		ele.get(1).click();

		Thread.sleep(3000);
		driver.quit();

	}

}
