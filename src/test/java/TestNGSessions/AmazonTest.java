package TestNGSessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonTest extends BaseTest {
		
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
	
	
}
