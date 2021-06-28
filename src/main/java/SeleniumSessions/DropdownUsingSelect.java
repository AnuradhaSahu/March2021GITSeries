package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownUsingSelect {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
//		WebElement indus_ele=driver.findElement(By.id("Form_submitForm_Industry"));
//	
//		Select industry=new Select(indus_ele);
//		
//		industry.selectByIndex(3);
//		industry.selectByValue("Computer/Technology-Reseller");
//		industry.selectByVisibleText("Government - National / Federal (inc Military)");
//		
		
		
		By country=By.id("Form_submitForm_Country");
		By industry=By.id("Form_submitForm_Industry");
		
		doSelectDropDownbyIndex(country,8);
		doSelectDropDownbyVisibleText(industry,"Travel");
		doSelectDropDownbyValue(country,"Cocos (Keeling) Islands");
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSelectDropDownbyIndex(By locator,int index) {
		Select select=new Select(getElement(locator));
		select.selectByIndex(index);
	}
	
	public static void doSelectDropDownbyVisibleText(By locator,String text) {
		Select select=new Select(getElement(locator));
		select.selectByVisibleText(text);
	}
	public static void doSelectDropDownbyValue(By locator,String value) {
		Select select=new Select(getElement(locator));
		select.selectByValue(value);
	}

}
