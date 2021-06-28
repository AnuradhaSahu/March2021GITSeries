package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {
	
	static WebDriver driver;
	/*
	 * This will initialise browser on teh basis of given browser
	 * @param	browsername
	 * @return  this will return driver
	 */
	public WebDriver initDriver(String browsername) {
		
		System.out.println("browsername is "+browsername);
		switch (browsername) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			break;
		case "safari":
			driver=new ChromeDriver();// incase of safari its not needed to do setup
			break;

		default:
			System.out.println("Browser not found........Please enter a valid browser");
			break;
		}
		 return driver;
	}

	public String launchurl(String url) {
		//if(url==null) return ;
		//if(url.isEmpty()) return;
		driver.get(url);
		return url;
	}
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public String getPageurl() {
		return driver.getCurrentUrl();
	}
	
	public void closeBrowser() {
		driver.close();
	}
	public void quit() {
		driver.quit();
	}
	
	
}
