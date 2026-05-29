package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ismethods {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");

		Thread.sleep(3000);
		boolean dis = driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']")).isDisplayed();
		System.out.println(dis);

		WebElement ele = driver.findElement(By.id("pollanswers-1"));
//		ele.click();
		Thread.sleep(1000);
		System.out.println(ele.isSelected());

		boolean ena = driver.findElement(By.id("vote-poll-1")).isEnabled();
		System.out.println(ena);

		Thread.sleep(3000);
		driver.quit();

	}

}
