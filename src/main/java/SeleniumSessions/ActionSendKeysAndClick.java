package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionSendKeysAndClick {

	static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		By email=By.xpath("//input[@name='email']");
		By pwd=By.xpath("//input[@name='password']");
		By btnLogin=By.xpath("//input[@type='submit']");
//		
//		Actions act= new Actions(driver);
//		act.sendKeys(driver.findElement(email),"anu@gmail.com").perform();
//		act.sendKeys(driver.findElement(pwd),"1234").perform();
//		act.click(driver.findElement(btnLogin)).perform();
		
		doSendKeys(email,"Test@456.com");
		doSendKeys(pwd,"Test@456");
		doClick(btnLogin);
		doDoubleclick(btnLogin);

			
	}
	public static  WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSendKeys(By locator, String value) {
		Actions act= new Actions(driver);
		act.sendKeys(getElement(locator), value).perform();
	}
	
	public static void doClick(By locator) {
		Actions act= new Actions(driver);
		act.click(getElement(locator)).perform();
	}
	
	public static void doDoubleclick(By locator) {
		Actions act=new Actions(driver);
		act.doubleClick(getElement(locator));
	}

}
