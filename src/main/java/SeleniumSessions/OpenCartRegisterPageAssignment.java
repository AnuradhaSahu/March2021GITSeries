package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenCartRegisterPageAssignment {	
	
	public static void main(String[] args) {		
	
	BrowserUtil br= new BrowserUtil();
	WebDriver driver=br.initDriver("chrome");

	br.launchurl("https://www.opencart.com/");
	br.launchurl("https://www.opencart.com/index.php?route=account/register");
	
	By username=By.id("input-username");
	By Firstname=By.id("input-firstname");
	By Lastname=By.id("input-lastname");
	By email=By.id("input-email");
	By country=By.name("country_id");
	By password=By.id("input-password");
	By btnRegister=By.id("button-register");	
	
	ElementUtilLibrary ele= new ElementUtilLibrary(driver);
	ele.getElement(username).sendKeys("TestSelenium");
	ele.getElement(Firstname).sendKeys("Anu");
	ele.getElement(Lastname).sendKeys("Test");
	ele.getElement(email).sendKeys("Anu@Test.com");
	ele.getElement(country).click();
	ele.getElement(password).sendKeys("Pass@123$");
	ele.doClick(btnRegister);
	
	br.closeBrowser();

}
}
