package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValue {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		Thread.sleep(3000);
		String css = driver.findElement(By.xpath("//span[text()='Forgotten password?']")).getCssValue("color");
		System.out.println(css);

		Thread.sleep(3000);
		driver.quit();

	}

}
