package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowHandleAssignment {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.opencart.com/index.php?route=support/contact");
		
		driver.findElement(By.xpath("//img[@title='Facebook Marketing Partner']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Linkedin']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Facebook']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Twitter']")).click();
		//1.collect window ids 
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> it=handles.iterator();
		String ParentId=it.next();
		System.out.println("ParentId is "+ParentId);		
		String ChildId1=it.next();
		System.out.println("ChildId1 is "+ChildId1);
		String ChildId2=it.next();
		System.out.println("ChildId2 is "+ChildId2);
		String ChildId3=it.next();
		System.out.println("ChildId3 is "+ChildId3);
		String ChildId4=it.next();
		System.out.println("ChildId4 is "+ChildId4);
		//Switching
		driver.switchTo().window(ChildId1);
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(ChildId2);
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(ChildId3);
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(ChildId4);
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(ParentId);
		driver.quit();
		
		
	}

}
