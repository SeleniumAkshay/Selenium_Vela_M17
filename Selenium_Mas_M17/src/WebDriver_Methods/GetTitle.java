package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
//		System.out.println(driver.getTitle());
		String title = driver.getTitle();
		System.out.println(title);
		if (title.contains("Facebook")) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

	}

}
