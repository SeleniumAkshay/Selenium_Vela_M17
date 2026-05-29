package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
//		System.out.println(driver.getCurrentUrl());
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if (url.contains("instagram")) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

	}

}
