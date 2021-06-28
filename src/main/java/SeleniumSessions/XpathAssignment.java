package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathAssignment {
    
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
	    		
		createNewContact();
		checkbox("AMSTERDAM");
		contactsCompany("AMSTERDAM");
		phoneNumber("AMSTERDAM");
		contactsEmail("AMSTERDAM");
	}
	public static void createNewContact() throws InterruptedException {
		 WebElement contacts=driver.findElement(By.xpath("//a[@title='Contacts']"));
			Actions act=new Actions(driver);
			act.moveToElement(contacts).perform();
		driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Awesomework");
		driver.findElement(By.xpath("//input[@id='surname']")).sendKeys("AMS");
		driver.findElement(By.xpath("//input[@name='client_lookup']")).sendKeys("AWS");
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("890890");
		driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("123456789");
		driver.findElement(By.xpath("//input[@id='home_phone']")).sendKeys("678678678");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("AWS@gmail.com");
		driver.findElement(By.xpath("(//input[@class='button' and @type='submit']/parent::td)[1]/child::input[@value='Save']")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//a[@title='Contacts']/parent::li")).click();
	}
	public static void checkbox(String name) {
		String checkboxXpath="//a[contains(text(),'"+name+"')]/parent::td/preceding-sibling::td/input[@type='checkbox']";
		driver.findElement(By.xpath(checkboxXpath)).click();
	}
	public static void phoneNumber( String name) {
		String PhNumXpath="(//a[contains(text(),'"+name+"')]/parent::td//following-sibling::td/span)[1]";
		System.out.println(driver.findElement(By.xpath(PhNumXpath)).getText());
	}
	public static void contactsCompany(String name) {
		String ContactsCompanyXpath="//a[contains(text(),'"+name+"')]/parent::td/following-sibling::td/a[@context='company']";
		System.out.println(driver.findElement(By.xpath(ContactsCompanyXpath)).getText());
	}
	public static void contactsEmail(String name) {
		String emailxpath="//a[contains(text(),'"+name+"')]/parent::td//following-sibling::td/a[contains(text(),'AWS@gmail.com')]";
		System.out.println(driver.findElement(By.xpath(emailxpath)).getText());
	}
}
