package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");

		Thread.sleep(3000);
		String value = driver.findElement(By.name("email")).getAttribute("class");
		System.out.println(value);

		String value1 = driver.findElement(By.name("email")).getDomProperty("className");
		System.out.println(value1);

		Thread.sleep(3000);
		driver.quit();

	}

}
