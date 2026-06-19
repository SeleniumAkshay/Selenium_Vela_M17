package DropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelect_New {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");

		WebElement ele = driver.findElement(By.id("select3"));
		Select select = new Select(ele);
		select.selectByIndex(7);
		Thread.sleep(2000);
		select.selectByIndex(4);
		Thread.sleep(2000);
		select.selectByValue("United States Of America");
		Thread.sleep(2000);
		select.selectByVisibleText("Germany");

		System.out.println(select.isMultiple());
//		select.deselectByIndex(4);

//		select.getWrappedElement().click();
		select.getWrappedElement().sendKeys("Canada");
		System.out.println(select.getWrappedElement().getText());

		Thread.sleep(3000);
		driver.quit();

	}

}
