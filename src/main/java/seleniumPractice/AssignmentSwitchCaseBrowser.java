package seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentSwitchCaseBrowser {
	static WebDriver driver;

	public static void main(String[] args) {

		String Browser="firefox";
		WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		WebDriverManager.edgedriver().setup();
		switch(Browser) {
		case "chrome":
			driver=new ChromeDriver();
			driver.get("https://www.amazon.in/");
			break;
		case "firefox":
			driver=new FirefoxDriver();
			driver.get("https://www.amazon.in/");
			break;
		case "edge":
			driver=new FirefoxDriver();
			driver.get("https://www.amazon.in/");
			break;	
        default:
        	System.out.println("Please enter a correct browser");
        	break;
		}
		
		
		
	}

}
