package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverBasics {

	public static void main(String[] args) {
		
       // System.setProperty("webdriver.chrome.driver","C:\\Users\\rakes\\Desktop\\chromedriver_win32\\chromedriver.exe");
	    WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
	
		driver.get("https://www.google.com");//launch url
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equals("Google")) {
			System.out.println("correct title");
		}else {
			System.out.println("Incorrect title");
		}
		System.out.println(driver.getPageSource());
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();//close the  browser
		
		
		
		
	}

}
