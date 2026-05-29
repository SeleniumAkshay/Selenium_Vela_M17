package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("Books" + Keys.ENTER);
		Thread.sleep(3000);
		driver.findElements(By.cssSelector("a.nav-a")).get(9).click();

		Thread.sleep(3000);
		driver.quit();

	}

}
