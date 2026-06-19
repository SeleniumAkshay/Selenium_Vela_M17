package WebDriver_Methods;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_activeElement {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		Thread.sleep(3000);
		driver.switchTo().activeElement().sendKeys("Vamsi" + Keys.TAB + "Vamsi@1234" + Keys.ENTER);

		Thread.sleep(3000);
		driver.quit();

	}

}
