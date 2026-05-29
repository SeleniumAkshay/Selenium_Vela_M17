package JSE;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.oracle.com/database/technologies/oracle-database-software-downloads.html");

		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement ele = driver.findElement(By.xpath("//h2[text()='Oracle Database Enterprise Edition']"));

		js.executeScript("arguments[0].scrollIntoView(true);", ele);

//		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
//		Thread.sleep(2000);
//		js.executeScript("window.scrollTo(0,0);");

//		Thread.sleep(1000);
//		js.executeScript("window.scrollTo(0,1000);");

//		js.executeScript("window.scrollBy(0,500);");
//		Thread.sleep(1000);
//		js.executeScript("window.scrollBy(0,1000);");

		Thread.sleep(3000);
		driver.quit();

	}

}
