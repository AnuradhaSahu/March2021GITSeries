package TestNGSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTestwithBM {
	public WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
	}
	
	@Test(priority=1)
	public void titleTest() {	
		String title=driver.getTitle();
		System.out.println("Page title is "+title);
		Assert.assertEquals(title, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	}
	
	@Test(priority=2)
	public void searchTest() {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("MacBook");
		driver.findElement(By.id("twotabsearchtextbox")).submit();
	   boolean flag=driver.findElement(By.xpath("(//span[contains(text(),'macbook')])[1]")).isDisplayed();
	Assert.assertTrue(flag);
	}
	
	@AfterMethod
	 public void tearDown() {
		driver.quit();
	}

}
