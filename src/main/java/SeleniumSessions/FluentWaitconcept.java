package SeleniumSessions;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitconcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		/*
		 * Fluent Wait() is a class-implements wait interface
		 * it contains until() method + other methods
		 * its syntax  is top casting
		 */
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://classic.crmpro.com/index.html");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("groupautomation");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(3000);
		By contactLink=By.linkText("CONTACTS");
		
//		Wait<WebDriver> wait= new FluentWait<WebDriver>(driver)
//				.withTimeout(Duration.ofSeconds(10))
//				.pollingEvery(Duration.ofMillis(2))
//				.ignoring(StaleElementReferenceException.class,NoSuchElementException.class);
//		
//		wait.until(ExpectedConditions.presenceOfElementLocated(contactLink));
		
		waitforPresenceofElementusingFluentWait(contactLink,10,1000);
					
	}
	public static WebElement waitforPresenceofElementusingFluentWait(By locator,int timeout,int intervalTime) {
		Wait<WebDriver> wait= new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeout))
				.pollingEvery(Duration.ofMillis(intervalTime))
				.ignoring(StaleElementReferenceException.class,NoSuchElementException.class);
		
		 return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	public static WebDriver waitforPresenceofElementinFrameusingFluentWait(By locator,int timeout,int intervalTime) {
		Wait<WebDriver> wait= new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeout))
				.pollingEvery(Duration.ofMillis(intervalTime))
				.ignoring(NoSuchElementException.class,NoSuchFrameException.class);
		
		 return wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator));
	}
	
	public static Alert waitforAlertusingFluentWait(By locator,int timeout,int intervalTime) {
		Wait<WebDriver> wait= new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeout))
				.pollingEvery(Duration.ofMillis(intervalTime))
				.ignoring(NoSuchElementException.class);
		
		 return wait.until(ExpectedConditions.alertIsPresent());
	}

}
