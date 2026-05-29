package DropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");

		WebElement dd = driver.findElement(By.id("select-multiple-native"));
		Select sel = new Select(dd);

		sel.selectByVisibleText("Mens Casual Slim Fit...");
		Thread.sleep(1000);
		sel.selectByIndex(1);
		Thread.sleep(1000);
		sel.selectByValue("Opna Women's Short Sleeve Moisture");
		Thread.sleep(1000);
//		sel.deselectByIndex(3);

		System.out.println(sel.getFirstSelectedOption().getText());
		System.out.println();

		List<WebElement> allSelected = sel.getAllSelectedOptions();

		for (WebElement webElement : allSelected) {
			System.out.println(webElement.getText());
		}
		System.out.println();

		List<WebElement> options = sel.getOptions();
		for (WebElement webElement : options) {
			System.out.println(webElement.getText());
		}

		sel.deselectAll();

		System.out.println();
		System.out.println(sel.isMultiple());

		Thread.sleep(3000);
		driver.quit();

	}

}
