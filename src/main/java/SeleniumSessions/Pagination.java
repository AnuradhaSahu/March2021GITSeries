package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pagination {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://classic.crmpro.com/index.html");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("groupautomation");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(2000);
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.xpath("//a[@title='Contacts']")).click();
		Thread.sleep(2000);

		List<WebElement> pages=
			driver.findElements(By.xpath("(//div[@class='pagination'])[1]/a"));
		
		int i=0;
		while(true) {
			if(driver.findElements(By.linkText("Varun Raju")).size()==1) {
				selectContactCheckbox("Varun Raju");
				break;
			}
			//pagination logic
			else {
				try {
					pages.get(i).click();										
				}catch(Exception e){
					System.out.println("Pagination is over..");
					break;
				}
				pages=driver.findElements(By.xpath("(//div[@class='pagination'])[1]/a"));
			}
			i++;
		}
		
		
		
		
		
	}
	public static void selectContactCheckbox(String name) {
		String checkbox="//a[text()='"+name+"']/parent::td/preceding-sibling::td/input";
		driver.findElement(By.xpath(checkbox)).click();
	}

}
