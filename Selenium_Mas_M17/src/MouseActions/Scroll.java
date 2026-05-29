package MouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");

		Thread.sleep(2000);
		Actions act = new Actions(driver);
//		act.scrollByAmount(0, 500).perform();

		WebElement ele = driver.findElement(By.xpath("//strong[text()='Featured products']"));
//		act.scrollToElement(ele).perform();

		ScrollOrigin sc = ScrollOrigin.fromElement(ele);
		act.scrollFromOrigin(sc, 0, 100).perform();

		Thread.sleep(3000);
		driver.quit();

	}

}
