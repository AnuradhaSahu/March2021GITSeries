package TestNGSessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class cartRegisterusingDataProvider extends CartLoginBaseTest{
	
	@DataProvider
	public Object[][] registerTestData() {
		return new Object[][] {
			{"OLIVE","JAMES","OLIVE@gmail.com","1234567890","pass@123","pass@123"}
		};
	}
	
	@Test(dataProvider= "registerTestData")
	public void registerTest(String fn,String ln,String email,String tel,String pwd,String cnfpwd) {		
		Assert.assertTrue(doRegister(fn,ln,email,tel,pwd,cnfpwd));
	}
	
	
	
	
	
	public boolean doRegister(String fn,String ln,String email,String tel,String pwd,String cnfpwd) {
		driver.findElement(By.name("firstname")).sendKeys(fn);		
		driver.findElement(By.name("lastname")).sendKeys(ln);
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("telephone")).sendKeys(tel);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.name("confirm")).sendKeys(cnfpwd);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();		
		driver.findElement(By.xpath("//input[@value='Continue']")).click();

			
		String msg=
				driver.findElement(By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]")).getText();	
		if(msg.contains("Your Account Has Been Created!")) {
			return true;
		}
		return false;

	}
	
	
	
	

}
