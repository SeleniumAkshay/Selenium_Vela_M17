package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Report {

	@Test
	public void report() {
		System.out.println("Report is generated");
		Reporter.log("Hello", false);
		Reporter.log("Bye", true);
	}

}
