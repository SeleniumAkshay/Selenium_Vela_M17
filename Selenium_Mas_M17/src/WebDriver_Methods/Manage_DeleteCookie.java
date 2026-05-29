package WebDriver_Methods;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage_DeleteCookie {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		Thread.sleep(3000);

//		driver.manage().deleteCookieNamed("fr");

//		Cookie c1 = new Cookie("fr", "0EpIzu8sMooTqNXlT..Bp-ZMj..AAA.0.0.Bp-ZMj.AWfxRgH0WwdtpjespESIczForLc");
//		driver.manage().deleteCookie(c1);
//
//		System.out.println(driver.manage().getCookieNamed("fr"));

//		driver.manage().deleteAllCookies();

		Cookie newCookie = new Cookie("Qspiders", "Selenium_M17");
		driver.manage().addCookie(newCookie);

		Set<Cookie> allCookies1 = driver.manage().getCookies();
		for (Cookie coo : allCookies1) {
			System.out.println(coo);
		}

		Thread.sleep(3000);
		driver.quit();

	}

}
