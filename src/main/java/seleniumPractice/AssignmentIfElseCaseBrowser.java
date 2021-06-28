package seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentIfElseCaseBrowser {

	public static void main(String[] args) {
		
        String Browser="chrome";
		WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		WebDriverManager.edgedriver().setup();
		
		if(Browser.equals("chrome")) {
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
		}else if(Browser.equals("FireFox")) {
			WebDriver driver=new FirefoxDriver();
			driver.get("https://www.facebook.com/");
		}else {
			WebDriver driver=new EdgeDriver();
			driver.get("https://www.facebook.com/");
		}
		

	}

}
