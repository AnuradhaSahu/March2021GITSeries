package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlerAPI {

	public static void main(String[] args) {

		//handling different windows
		//1.collect window ids   2.switch to child window  3.come back to parent window
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.opencart.com/index.php?route=support/contact");
		
		driver.findElement(By.xpath("//img[@title='Facebook Marketing Partner']")).click();
		
		//1.collect window ids 
		Set<String> hanldes=driver.getWindowHandles();
		Iterator<String> it=hanldes.iterator();
		
		String parentwindowid=it.next();
		System.out.println("parentwindowid is "+ parentwindowid);
		
		String childwindowid=it.next();
		System.out.println("childwindowid is "+ childwindowid);
		
		//2.switch to child window
		driver.switchTo().window(childwindowid);
		System.out.println("childwindow  Title is "+driver.getTitle());
		driver.close();
		
		
		//3.come back to parent window
		driver.switchTo().window(parentwindowid);
		System.out.println("parentwindow  Title is "+driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();		
	}

}
