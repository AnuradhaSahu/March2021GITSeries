package TestNGSessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ParellelExecutionAssignment extends BaseTest {
	
	
	@Test(priority=1)
	public void titleTest() {
		String title=driver.getTitle();
		System.out.println("Page title is "+title);
		Assert.assertEquals(title, "CRMPRO");
	}
	

	@Test(priority=2)
	public void displaySearchTest() {
		Assert.assertEquals(driver.findElement(By.xpath("//input[@type='image']")), true);
	}
		
	

}
