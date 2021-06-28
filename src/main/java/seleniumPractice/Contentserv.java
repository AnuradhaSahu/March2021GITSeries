package seleniumPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Contentserv {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://pxp-demo.contentserv.com/test-rdbms/?login");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input#userNameField")).sendKeys("Admin");
		driver.findElement(By.cssSelector("span.MuiButton-label")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Pass@123$");
		driver.findElement(By.xpath("//span[@class='MuiButton-label']")).click();

		
		
		
		
		
		
		
	}

}
