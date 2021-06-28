package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitconcept {

	static WebDriver driver;
	public static void main(String[] args) {
		/*
		 * customise as per webelement
		 * not applied for all the webelements by default
		 * nota global wait
		 * can be applied for non web elements like title,url,alerts
		 */

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/login");
		
		//Miantianing By locators
		By email=By.id("input-email");
		By pwd=By.id("input-password");
		By login=By.xpath("//button[@class='btn btn-primary btn-lg btn-block visible-xs-block']");
		
		//creating webdriver class object- having 3 constructors
//		WebDriverWait wait=new WebDriverWait(driver, 10);
//	       WebElement ele=wait.until(ExpectedConditions.presenceOfElementLocated(email));
//	       ele.sendKeys("Anu78@ghgh.com");
		
		
		doPresenceofElementLocated(email,5).sendKeys("anu@ert.com");
		
	       driver.findElement(pwd).sendKeys("789789");
	       driver.findElement(login).click();
}
	public static WebElement doPresenceofElementLocated(By locator, int timeout) {
		WebDriverWait wait=new WebDriverWait(driver,timeout);
		//WebElement ele=wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		//return ele;
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

}
