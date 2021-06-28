package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ComplexXpaths {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
//		driver.get("https://classic.crmpro.com/index.html");
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("groupautomation");
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test@12345");
//		driver.findElement(By.xpath("//input[@value='Login']")).click();
//		Thread.sleep(2000);
		driver.switchTo().frame("mainpanel");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='Contacts']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@value='New Contact']")).click();
//		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Gol");
//		driver.findElement(By.xpath("//input[@name='surname']")).sendKeys(" Sahu");
			
		driver.findElement(By.xpath("//a[text()='Apple Malvia']/parent::td/preceding-sibling::td/input")).click();
       String xpath= driver.findElement(By.xpath("//a[text()='Apple Malvia']/parent::td/following-sibling::td/a[@context=\"company\"]")).getText();
		System.out.println(xpath);
		//selectContactCheckbox("Apple Malvia");

		
	}
	public static void login(By locator) {
		driver.get("https://classic.crmpro.com/index.html");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("groupautomation");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}
	
	public static void selectContactCheckbox(String name) {
		String checkbox="//a[text()='"+name+"']/parent::td/preceding-sibling::td/input";
		driver.findElement(By.xpath(checkbox)).click();
	}
	public static void CreateNewContact() throws InterruptedException {
		driver.switchTo().frame("mainpanel");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='Contacts']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@value='New Contact']")).click();
//		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Gol");
//		driver.findElement(By.xpath("//input[@name='surname']")).sendKeys(" Sahu");
		
	}

}
