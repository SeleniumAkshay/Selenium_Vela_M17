package DropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelect {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");

		WebElement countryDd = driver.findElement(By.id("select3"));
		Select sel = new Select(countryDd);
		sel.selectByIndex(7);
		Thread.sleep(1000);
		sel.selectByVisibleText("United Kingdom");
		Thread.sleep(1000);
		sel.selectByValue("Germany");
		Thread.sleep(1000);
		sel.selectByContainsVisibleText("United States Of America");
//		Thread.sleep(1000);
//		sel.deSelectByContainsVisibleText("United States Of America");

		Thread.sleep(1000);
		sel.getWrappedElement().click();
		Thread.sleep(1000);
		sel.getWrappedElement().sendKeys("Poland");
		Thread.sleep(1000);
		System.out.println(sel.getWrappedElement().getText());
		
		Thread.sleep(3000);
		driver.quit();

	}

}
