package MouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropBy {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(
				"https://www.flipkart.com/search?q=iphone&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off&as-pos=1&as-type=HISTORY");

		Thread.sleep(3000);
		Actions act = new Actions(driver);

		WebElement ele = driver.findElement(By.xpath("(//div[@class='G12X4V'])[1]"));
		act.dragAndDropBy(ele, 50, 0).perform();
		Thread.sleep(2000);
		WebElement ele1 = driver.findElement(By.xpath("(//div[@class='G12X4V'])[2]"));
		act.dragAndDropBy(ele1, -50, 0).build().perform();

		Thread.sleep(3000);
		driver.quit();

	}

}
