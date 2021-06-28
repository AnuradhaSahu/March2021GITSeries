package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowHandlingUsingList {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.opencart.com/index.php?route=support/contact");
		
		driver.findElement(By.xpath("//img[@title='Facebook Marketing Partner']")).click();
		
		//1.collect window ids using set
		Set<String> hanldes=driver.getWindowHandles();
		
		//using list
		List<String> handlelist=new ArrayList<String>(hanldes);
		
		String parentWindowID=handlelist.get(0);
		System.out.println("parentWindowID "+parentWindowID);		
		
		String childWindowID=handlelist.get(1);
		System.out.println("childWindowID "+childWindowID);
		
		//Switching
		driver.switchTo().window(childWindowID);
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.switchTo().window(parentWindowID);
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		
		
		
	}

}
