package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForPollingTime {

	static WebDriver driver;
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.get("https://classic.crmpro.com/index.html");
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("groupautomation");
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test@12345");
			
			By Login=(By.xpath("//input[@value='Login']"));
			
			waitforVisibilityofElement(Login,10);
			
			
	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void waitforVisibilityofElement(By locator,int timeout) {
		WebDriverWait wait= new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(getElement(locator)));
 
	}
	public static List<WebElement> waitforvisiblityofelements(By locator,int timeout) {
		WebDriverWait wait= new WebDriverWait(driver,10);
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}
	
	public static void printElementText(By locator,int timeout) {
		waitforvisiblityofelements(locator,timeout)
		.stream().forEach(e->System.out.println(e.getText()));
	}

}
