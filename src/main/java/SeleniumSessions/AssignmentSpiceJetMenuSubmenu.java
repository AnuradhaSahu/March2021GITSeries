package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentSpiceJetMenuSubmenu {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(5000);
		
		WebElement Login=driver.findElement(By.xpath("//a[@id='ctl00_HyperLinkLogin']"));
		WebElement SpiceClubMembers=
		driver.findElement(By.xpath("//a[@class='' and text()='SpiceClub Members']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(Login).perform();
		Thread.sleep(2000);
	    act.moveToElement(SpiceClubMembers).perform();
	    Thread.sleep(2000);		
		driver.findElement(By.xpath("//ul/li[@class=\"li-login float-right tabres\"]//li[@class=\"hide-mobile\"]//ul/li")).click();

	}

}
