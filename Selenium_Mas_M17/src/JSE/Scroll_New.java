package JSE;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_New {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.amazon.in/");

		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement ele = driver.findElement(By.id("twotabsearchtextbox"));
		js.executeScript("arguments[0].value='Laptop';", ele);

		WebElement ele1 = driver.findElement(By.id("nav-search-submit-button"));
		js.executeScript("arguments[0].click();", ele1);

//		WebElement ele = driver
//				.findElement(By.xpath("//span[text()='Min. 30% off | Curated collections from Small Businesses']"));
//		js.executeScript("arguments[0].scrollIntoView(false);", ele);

//		js.executeScript("window.scrollBy(0,500);");
//		js.executeScript("window.scrollTo(0,500);");
//		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
//		Thread.sleep(2000);
//		js.executeScript("window.scrollTo(0,0);");

		Thread.sleep(3000);
		driver.quit();

	}

}
