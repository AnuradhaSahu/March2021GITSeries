package TestNGSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
public WebDriver driver;
	
  //  @Parameters({"browser","url","username","password"})
    @Parameters({"browser","url"})
	@BeforeTest
//	public void setup(String browserName, String url,String username, String password) {
	public void setup(String browserName, String url) {

    	switch(browserName) {
    	case "chrome":
    		WebDriverManager.chromedriver().setup();
    		driver=new ChromeDriver();
    		break;
    	case "firefox":
    		WebDriverManager.firefoxdriver().setup();
    		driver=new FirefoxDriver();
    		break;	
    	default:
    		System.out.println("Please pass the correct browser");
    		break;    	
    	}
    		
		driver.get(url);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElement(By.name("username")).sendKeys(username);
		//driver.findElement(By.name("password")).sendKeys(password);
		//driver.findElement(By.xpath("//input[@value='Login']")).click();

	}
	
	@AfterTest
	 public void tearDown() {
		driver.quit();
	}

}
