package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_ByInAndDep {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[contains(@placeholder,'Search')])[1]")).sendKeys("iPhone" + Keys.ENTER);

		Thread.sleep(3000);
		String price = driver.findElement(By.xpath("(//div[@class='RG5Slk'])[1]/../../div[2]/div[1]/div/div[1]"))
				.getText();
		System.out.println(price);

		Thread.sleep(3000);
		driver.quit();

	}

}
