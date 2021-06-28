package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForURL {

	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

//		WebDriverWait wait =new WebDriverWait(driver,5);
//	      wait.until(ExpectedConditions.urlContains("login"));
//	
		if(waitForURL("login",5)) {
			System.out.println("login url is correct");
			//System.out.println(getPageTitle("Rediffmail",10));
		}
		System.out.println(getPageTitle("login",10));

		
		
	}
	
	public static boolean waitForURL(String urlFraction,int timeout) {
		WebDriverWait wait =new WebDriverWait(driver,5);
	    return wait.until(ExpectedConditions.urlContains("login"));
	  }
	public static boolean waitForURLMatchs(String urlFraction,int timeout) {
		WebDriverWait wait =new WebDriverWait(driver,5);
	    return wait.until(ExpectedConditions.urlMatches("login"));
	  }
	public static boolean waitForURLTobe(String urlFraction,int timeout) {
		WebDriverWait wait =new WebDriverWait(driver,5);
	    return wait.until(ExpectedConditions.urlToBe("https://mail.rediff.com/cgi-bin/login.cgi"));
	  }
	public static boolean waitForTitleContains(String title,int timeout) {
		WebDriverWait wait =new WebDriverWait(driver,5);
	    return wait.until(ExpectedConditions.titleContains("login"));
	  }
	public static boolean waitForTitleIs(String title,int timeout) {
		WebDriverWait wait =new WebDriverWait(driver,5);
	    return wait.until(ExpectedConditions.titleIs("rediffMail"));
	  }
	public static String getPageTitle(String title,int timeout) {
		waitForTitleContains(title,timeout);
		return driver.getTitle();
	}

}
