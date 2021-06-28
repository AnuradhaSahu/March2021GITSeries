package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClassMoveTOElement {
 static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		//driver.get("http://mrbool.com");
//		
//		WebElement Content=driver.findElement(By.className("menulink"));
//		Actions act=new Actions(driver);
//		act.moveToElement(Content).perform();
//		Thread.sleep(2000);
//		
//		driver.findElement(By.linkText("COURSES")).click();
//		By content=By.xpath("//a[@class=\"menulink\"]");
//		By courses=By.linkText("COURSES");
//		
//		HandletwoLevelmenu(content,courses);
//		
		 driver.get("https://www.spicejet.com/");
		 Thread.sleep(3000);
		 By Login=By.xpath("//a[@id='ctl00_HyperLinkLogin']");
		 By SpiceClubMembers=By.xpath("//a[@class='' and text()='SpiceClub Members']");
		 By ActualLogin=By.xpath("//ul/li[@class=\"li-login float-right tabres\"]//li[@class=\"hide-mobile\"]//ul/li");
					
		HandleThreeLevelmenu(Login,SpiceClubMembers,ActualLogin);
		
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void HandletwoLevelmenu(By Parentlocator,By childlocator) {
		Actions act=new Actions(driver);
		act.moveToElement(getElement(Parentlocator)).perform();
		getElement(childlocator).click();
	}
	
	public static void HandleThreeLevelmenu(By Parentlocator1,By Parentlocator2,By childlocator) throws InterruptedException {
		Actions act=new Actions(driver);
		act.moveToElement(getElement(Parentlocator1)).perform();
        Thread.sleep(2000);
		act.moveToElement(getElement(Parentlocator2)).perform();
        Thread.sleep(2000);
		getElement(childlocator).click();
	}

}
