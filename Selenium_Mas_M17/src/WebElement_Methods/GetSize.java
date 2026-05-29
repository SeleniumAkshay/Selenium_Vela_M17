package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");

		Thread.sleep(3000);
		Dimension size = driver.findElement(By.id("small-searchterms")).getSize();
		System.out.println(size);
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());

		System.out.println();

		Point loc = driver.findElement(By.xpath("//input[@value='Search']")).getLocation();
		System.out.println(loc);
		System.out.println(loc.getX());
		System.out.println(loc.getY());

		System.out.println();

		Rectangle rect = driver.findElement(By.partialLinkText("Register")).getRect();
		System.out.println(rect);

		Thread.sleep(3000);
		driver.quit();

	}

}
