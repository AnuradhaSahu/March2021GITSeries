package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicWebTable {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://classic.crmpro.com/index.html");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("groupautomation");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(2000);
		driver.switchTo().frame("mainpanel");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='Contacts']")).click();
		Thread.sleep(2000);
		
		//left side-checkbox
//		driver.findElement(By.xpath
//		("//a[contains(text(),'Apple Malvia')]/parent::td/preceding-sibling::td/input[@type='checkbox' and @name='contact_id']")).click();
//		
		selectcheckbox("Apple Malvia");
		Thread.sleep(2000);
		//right side-other fields-ex- getting the email
	
		getCompanyEmail("Banana Chautala");
		Thread.sleep(2000);
		
		driver.close();
	}
	
	public static void selectcheckbox(String name) {
		String checkboxxpath="//a[contains(text(),'"+name+"')]/parent::td/preceding-sibling::td/input[@type='checkbox' and @name='contact_id']";
		driver.findElement(By.xpath(checkboxxpath)).click();
	}
	
	public static void getCompanyEmail(String email) {
		String companyname="//a[contains(text(),'"+email+"')]/parent::td/following-sibling::td/a[contains(text(),'ganesh.chautala@gmail.com')]";
        System.out.println(driver.findElement(By.xpath(companyname)).getText());	
	}

}
