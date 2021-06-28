package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenCartTestUsingLocators {

	public static void main(String[] args) {

		BrowserUtil br=new BrowserUtil();
		WebDriver driver=br.initDriver("chrome");
		
		br.launchurl("https://www.orangehrm.com/orangehrm-30-day-trial/");
		By Firstname=By.id("Form_submitForm_FirstName");// not inetracting with server
		By daytriallink=By.linkText("FREE 30 Day Trial");
		
		ElementUtilLibrary ele=new ElementUtilLibrary(driver);
		ele.doSendKeys(Firstname, "Testing");
		ele.doClick(daytriallink);
		
		br.closeBrowser();
		
		
		
		
	}

}
