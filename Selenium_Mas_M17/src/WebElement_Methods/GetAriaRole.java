package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAriaRole {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		Thread.sleep(3000);
		String password = driver.findElement(By.name("pass")).getAriaRole();
		System.out.println(password);

		String acc = driver.findElement(By.name("email")).getAccessibleName();
		System.out.println(acc);

		Thread.sleep(3000);
		driver.quit();

	}

}
