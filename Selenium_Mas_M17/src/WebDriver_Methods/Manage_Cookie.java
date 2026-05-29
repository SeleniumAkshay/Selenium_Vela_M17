package WebDriver_Methods;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage_Cookie {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		Thread.sleep(3000);

		Cookie singleCookie = driver.manage().getCookieNamed("api");
		System.out.println(singleCookie);
		System.out.println();

		Set<Cookie> allCookies = driver.manage().getCookies();
		for (Cookie coo : allCookies) {
			System.out.println(coo);
		}

		Thread.sleep(3000);
		driver.quit();

	}

}
