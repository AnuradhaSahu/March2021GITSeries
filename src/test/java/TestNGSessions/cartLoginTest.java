package TestNGSessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class cartLoginTest extends CartLoginBaseTest{
	
	@DataProvider
	public Object[][] loginTestData() {
		return new Object[][] {
			{"test@gmail.com", "pass@123"},
			{"test@gmail.com", " "},
			{" ", "pass@123"},
			{" ", " "}
	         };
	}
	
	@Test(dataProvider= "loginTestData")
	public void loginTest(String un,String pwd) {		
		Assert.assertTrue(doLogin(un,pwd));
	}
	
	public boolean doLogin(String un,String pwd) {
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys(un);
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(un);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		String error=
				driver.findElement(By.cssSelector("div.alert.alert-danger.alert-dismissible")).getText();	
		if(error.contains("No match for E-Mail Address and/or Password.")) {
			return true;
		}
		return false;

	}
	
	


}
