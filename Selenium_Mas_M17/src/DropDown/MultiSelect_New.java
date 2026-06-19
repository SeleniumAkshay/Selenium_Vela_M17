package DropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect_New {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");

		WebElement ele = driver.findElement(By.id("select-multiple-native"));
		Select sel = new Select(ele);

		sel.selectByIndex(3);
		Thread.sleep(2000);
		sel.selectByVisibleText("Mens Casual Premium ...");
		Thread.sleep(2000);

		System.out.println(sel.getFirstSelectedOption().getText());
		System.out.println();

		List<WebElement> selected = sel.getAllSelectedOptions();
		for (WebElement webElement : selected) {
			System.out.println(webElement.getText());
		}
		System.out.println();

		List<WebElement> all = sel.getOptions();
		for (WebElement webElement : all) {
			System.out.println(webElement.getText());
		}

//		sel.deselectByValue("Mens Casual Premium Slim Fit T-Shirts ");
		sel.deselectAll();

		Thread.sleep(3000);
		driver.quit();

	}

}
