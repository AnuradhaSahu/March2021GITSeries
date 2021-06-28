package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForAlert {

	static WebDriver driver;
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
//		
//		WebDriverWait wait = new WebDriverWait(driver, 5);
//		Alert alert= wait.until(ExpectedConditions.alertIsPresent());//automatically switch to alert
//		System.out.println(alert.getText());
//		alert.accept();
		
		//doWaitforAlert(5).dismiss();
		System.out.println(getAlertText(5));
		
		
	}
	//creating utility for the same
	public static Alert doWaitforAlert(int timeout) {
		WebDriverWait wait=new WebDriverWait(driver,timeout);
	    return wait.until(ExpectedConditions.alertIsPresent());
	}
	 public static void acceptAlert(int timeout) {
		 doWaitforAlert(timeout).accept();
	 }
	 public static void dismissAlert(int timeout) {
		 doWaitforAlert(timeout).dismiss();
	 }
	 public static String getAlertText(int timeout) {
		 return doWaitforAlert(timeout).getText();
	 }

}
