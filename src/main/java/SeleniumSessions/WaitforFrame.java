package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitforFrame {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://classic.crmpro.com/index.html");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("groupautomation");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		//Webdriverwait for frame
////		
//		WebDriverWait wait=new WebDriverWait(driver,5);
//		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("mainpanel"));
		waitForFrameElement("mainpanel",10);
		driver.findElement(By.linkText("CONTACTS")).click();
		Thread.sleep(3000);
		
	}
	public static void waitForFrameElement(String IDORNAME, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(IDORNAME));
	}

	public static void waitForFrameElement(int frameIndex, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIndex));
	}
	
	
	
	public static void waitforFrame(String IDOrName,int timeout) {
		WebDriverWait wait=new WebDriverWait(driver,timeout);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(IDOrName));
	}
	public static void waitforFrameString(String IDOrName,int timeout) {
		WebDriverWait wait=new WebDriverWait(driver,timeout);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(IDOrName));
	}
	public static void waitforFramebyIndex(int Frameindex,int timeout) {
		WebDriverWait wait=new WebDriverWait(driver,timeout);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(Frameindex));
	}
	public static WebElement waitForElementtobeclickable(By locator,int timeout) {
		WebDriverWait wait=new WebDriverWait(driver,timeout);
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	public static void clickWhenReady(By locator,int timeout) {
		waitForElementtobeclickable(locator,timeout);
	}

}
