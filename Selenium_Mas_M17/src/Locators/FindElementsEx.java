package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsEx {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");

//		driver.findElement(By.name("Gender")).click();
//		List<WebElement> elements = driver.findElements(By.name("Gender"));
//		elements.get(0).click();
//		Thread.sleep(2000);
//		elements.get(1).click();
//		System.out.println(elements.size());

		driver.findElements(By.name("Gender")).get(1).click();

		Thread.sleep(3000);
		driver.quit();

	}

}
