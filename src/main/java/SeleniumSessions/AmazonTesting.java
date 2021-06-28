package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTesting {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		String browser="chrome";
		if(browser.equals("chrome")) {
			 WebDriverManager.chromedriver().setup();//webdriver manager
				 driver= new ChromeDriver();
		}else if(browser.equals("Firefox")){
			WebDriverManager.firefoxdriver().setup();
			 driver=new FirefoxDriver();
		}
		else {
			System.out.println("Please pass the correct browser");
		}
		driver.get("https://www.amazon.in/");
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in")) {
			System.out.println("correct title");
		}else {
			System.out.println("Incorrect title");
		}
		System.out.println(driver.getPageSource());
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();//close the  browser
		
	}

}
