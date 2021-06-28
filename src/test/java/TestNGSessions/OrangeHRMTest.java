package TestNGSessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHRMTest extends BaseTest{	
	
	@Test(priority=2)
	public void titleTest() {	
		String title=driver.getTitle();
		System.out.println("Page title is "+title);
		Assert.assertEquals(title, "Free Human Resource Management Software | 30 Day Trial Creation");
	}
	
	@Test(priority=1)
	public void searchTest() {
		Assert.assertEquals(driver.findElement(By.xpath("//img[@class='nav-logo']")).isDisplayed(),true);
	}
	
	

}
