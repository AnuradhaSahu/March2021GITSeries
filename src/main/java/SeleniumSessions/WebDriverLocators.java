package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverLocators {
	
	static WebDriver driver;	
	
	//4th approach
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);// by locator will return any webelement		
	}
	
	//5th approach
	public static void doSendKeys(By locator,String value) {
		getElement(locator).sendKeys(value);
	}

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

		/*For locators-
		 * 1.Create webelement(By id,name,xpath,css etc)
		 * 2.perform some actions on webelemnt(click,sendkeys,gettext etc)
		 */
		//ID
		//1st Approach 		-ugly code and way of coding
		driver.findElement(By.id("Form_submitForm_FirstName")).sendKeys("Testing");
		
		//2nd approach -we r interacting with the server unneccessarily multiple times without performing any action
		WebElement firstname=driver.findElement(By.id("Form_submitForm_LastName"));
		firstname.sendKeys("Selenium");
		
		//3rd apporach// not inetracting with servers and maintains by locators
		By email=By.id("Form_submitForm_Email");
		driver.findElement(email).sendKeys("anu@Test.com");
		
		//4th approach-using generic functions
		By JobTitle=By.id("Form_submitForm_JobTitle");
		By CompanyName=By.id("Form_submitForm_CompanyName");
		By email1=By.id("Form_submitForm_Email");

		getElement(JobTitle).sendKeys("Software Engineer");
		
		//5th Approach-Using own custom wrapper method
		doSendKeys(CompanyName,"Google");
		
		//6th approach-using element util library
		

		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
